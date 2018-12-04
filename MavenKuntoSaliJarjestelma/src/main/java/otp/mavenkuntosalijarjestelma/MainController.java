package otp.mavenkuntosalijarjestelma;

import Dao.KayttajaDao;
import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.Kayttaja;
import Entities.KuukausiJasen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

public class MainController extends AbstractController {
    
    List languages = new ArrayList();
    
    private int currentScene;
    
    @FXML // fx:id="anchorPaneRoot"
    private AnchorPane anchorPaneRoot; // Value injected by FXMLLoader

    @FXML // fx:id="sceneBtn"
    private Button sceneBtn;
    @FXML // fx:id="searchBtn"
    private Button searchBtn;
    @FXML // fx:id="logoutBtn"
    private Button logoutBtn;
    
    @FXML // fx:id="languageLabel"
    private Label languageLabel; // Value injected by FXMLLoade

    @FXML // fx:id="languageSelector"
    private ChoiceBox<String> languageSelector; // Value injected by FXMLLoader

    @FXML // fx:id="mainPane"
    private AnchorPane mainPane;
    
    private SessionFactory sessionFactory;
    private static KertaJasenDao kertaDao;
    private static KuukausiJasenDao kuukausiDao;
    private static KayttajaDao kayttajaDao;
    
    private static FXMLController fxmlController;
    private static SearchController searchController;
    private static UpdaterController updateController;
    private static MainController mainController;
    
    public MainController() {
        
        mainController = this;
        sessionFactory = HibernateUtil.getSessionFactory();
        kertaDao = new KertaJasenDao(sessionFactory);
        kuukausiDao = new KuukausiJasenDao(sessionFactory);
        kayttajaDao = new KayttajaDao(sessionFactory);
        
        fxmlController = new FXMLController();
        searchController = new SearchController();
        updateController = new UpdaterController();
        localeBundleBaseString = "Bundles.MainScene"; // String lokalisaatiota varten. Hakee tällä oikean bundlen scenelle

        getKayttajaDao().addKayttaja(new Kayttaja("Olli", "Omistaja", "olliomistaja", "passu", true)); 
        getKayttajaDao().addKayttaja(new Kayttaja("Juho", "S", "juhos", "salainen", false));
    }
    
    public Stage getStage() {
        return (Stage) anchorPaneRoot.getScene().getWindow();
    }
    
    public static MainController getMainController() {
        return mainController;
    }

    // HAKUNÄKYMÄ
    @FXML
    void hakuNakymaVaihto(ActionEvent event) throws Exception {
        setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Search.fxml"), getControllerBundle(searchController)));
        currentScene = 0;   
    }
    // PÄÄNÄKYMÄ
    @FXML
    void sceneNakymaVaihto(ActionEvent event) throws Exception {
        setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"), getControllerBundle(fxmlController)));
        currentScene = 1;
    }   
    public void setScreen(Node node) {
        mainPane.getChildren().setAll(node);
    }
    @FXML
    void logout(ActionEvent event) throws Exception {
        LoginController.logKayttaja = null;
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        Scene scene = new Scene(root, 1300, 900);
        stage.setTitle("Log In");
        stage.setScene(scene);
    }
    
    public void reloadLocale() throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        Parent root = loader.load(getClass().getResource("/fxml/main.fxml"), getControllerBundle(this));
//        
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/styles/Styles.css");
//        getStage().setScene(scene);

        ResourceBundle bundle = getControllerBundle(this);
        searchBtn.setText(bundle.getString("search"));
        sceneBtn.setText(bundle.getString("scene"));
        languageLabel.setText(bundle.getString("language"));
        logoutBtn.setText(bundle.getString("logout"));
        
        selectLocaleAccordingToCurrentFXML();
        
    }

    private void selectLocaleAccordingToCurrentFXML() throws IOException {
        if (currentScene == 0) {
            setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Search.fxml"), getControllerBundle(searchController)));
        } else if (currentScene == 1) {
            setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"), getControllerBundle(fxmlController)));
        }
    }
    
    public ResourceBundle getControllerBundle(AbstractController controller) {
        return ResourceBundle.getBundle(controller.getLocaleBundleBaseString(), getLocale());
    }
    
    public static FXMLController getFxmlController() {
        return fxmlController;
    }
    public static SearchController getSearchController() {
        return searchController;
    }
    public static UpdaterController getUpdateController() {
        return updateController;
    }
    
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static KuukausiJasenDao getKuukausiDAO() {
        return kuukausiDao;
    }
    public static KertaJasenDao getKertaDAO() {
        return kertaDao;
    }
        public static KayttajaDao getKayttajaDao() {
        return kayttajaDao;
    }
    
    public Locale getLocale() {
        if (currentLocale == null) {
            return defaultLocale;
        } else {
            return currentLocale;
        }
    }
    
    public void setLocale(Locale locale) {
        currentLocale = locale;
    }
    
    public void setLocaleWithLangId(int id) {// 0  FI, 1 EN
        System.out.println(id);
        
        switch (id) {
            case 0:
                setCurrentLocale(new Locale("fi", "FI"));
                break;
            case 1:
                setCurrentLocale(new Locale("en", "NG"));
                break;
        }
        try {
            reloadLocale();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        languages.add("FI ");
        languages.add("EN ");
        
        assert sceneBtn != null : "fx:id=\"sceneBtn\" was not injected: check your FXML file 'main.fxml'.";
        assert searchBtn != null : "fx:id=\"searchBtn\" was not injected: check your FXML file 'main.fxml'.";
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'main.fxml'.";
        assert languageSelector != null : "fx:id=\"languageSelector\" was not injected: check your FXML file 'main.fxml'.";
        
        System.out.println("Choicebox is " + languageSelector);
        languageSelector.setItems(FXCollections.observableList(languages));
        languageSelector.getSelectionModel().selectFirst();
        
        languageSelector.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Kieli vaihdettu");
                setLocaleWithLangId(newValue.intValue());
                languageSelector.getSelectionModel().select(newValue.intValue());
            }
        });
    }
}
