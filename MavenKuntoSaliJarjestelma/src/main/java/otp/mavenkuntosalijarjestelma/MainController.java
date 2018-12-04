package otp.mavenkuntosalijarjestelma;

import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.KuukausiJasen;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import static java.util.ResourceBundle.getBundle;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import static javafx.collections.FXCollections.observableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import static javafx.fxml.FXMLLoader.load;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

/**
 *
 * @author juhos
 */
public class MainController extends AbstractController {
    
    List languages = new ArrayList();
    
    private int currentScene;
    
    @FXML // fx:id="anchorPaneRoot"
    private AnchorPane anchorPaneRoot; // Value injected by FXMLLoader

    @FXML // fx:id="sceneBtn"
    private Button sceneBtn;
    @FXML // fx:id="searchBtn"
    private Button searchBtn;
    
    @FXML // fx:id="languageLabel"
    private Label languageLabel; // Value injected by FXMLLoade

    @FXML // fx:id="languageSelector"
    private ChoiceBox<String> languageSelector; // Value injected by FXMLLoader

    @FXML // fx:id="mainPane"
    private AnchorPane mainPane;
    
    private SessionFactory sessionFactory;
    private static KertaJasenDao kertaDao;
    private static KuukausiJasenDao kuukausiDao;
    
    private static FXMLController fxmlController;
    private static SearchController searchController;
    private static UpdaterController updateController;
    private static MainController mainController;
    
    /**
     *
     */
    public MainController() {
        
        mainController = this;
        sessionFactory = HibernateUtil.getSessionFactory();
        kertaDao = new KertaJasenDao(sessionFactory);
        kuukausiDao = new KuukausiJasenDao(sessionFactory);
        fxmlController = new FXMLController();
        searchController = new SearchController();
        updateController = new UpdaterController();
        localeBundleBaseString = "Bundles.MainScene"; // String lokalisaatiota varten. Hakee tällä oikean bundlen scenelle

        //generateJengi();
    }
    
    /**
     *
     * @return
     */
    public Stage getStage() {
        return (Stage) anchorPaneRoot.getScene().getWindow();
    }
    
    /**
     *
     * @return
     */
    public static MainController getMainController() {
        return mainController;
    }
    
    /**
     *
     */
    public void generateJengi() {
        KuukausiJasen j1 = new KuukausiJasen();
        j1.setNimi("Risto R");
        j1.setKuukausiaJaljella(1);
        j1.setMaksuTapa("KORTTI");
        kuukausiDao.createKuukausiJasen(j1);
        
        KuukausiJasen j2 = new KuukausiJasen();
        j2.setNimi("Martti M");
        j2.setKuukausiaJaljella(2);
        j2.setMaksuTapa("KORTTI");
        kuukausiDao.createKuukausiJasen(j2);
        
        KuukausiJasen j3 = new KuukausiJasen();
        j3.setNimi("Keijo K");
        j3.setKuukausiaJaljella(3);
        j3.setMaksuTapa("KORTTI");
        kuukausiDao.createKuukausiJasen(j3);
        
        KuukausiJasen j4 = new KuukausiJasen();
        j4.setNimi("Sanna S");
        j4.setKuukausiaJaljella(4);
        j4.setMaksuTapa("KORTTI");
        kuukausiDao.createKuukausiJasen(j2);
    }

    // HAKUNÄKYMÄ
    @FXML
    void hakuNakymaVaihto(ActionEvent event) throws Exception {
        setScreen((Node) load(getClass().getResource("/fxml/Search.fxml"), getControllerBundle(searchController)));
        currentScene = 0;
        
    }

    // toinen näkymä
    @FXML
    void sceneNakymaVaihto(ActionEvent event) throws Exception {
        setScreen((Node) load(getClass().getResource("/fxml/Scene.fxml"), getControllerBundle(fxmlController)));
        currentScene = 1;
        
    }
    
    /**
     *
     * @throws IOException
     */
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
        
        selectLocaleAccordingToCurrentFXML();
        
    }

    private void selectLocaleAccordingToCurrentFXML() throws IOException {
        if (currentScene == 0) {
            setScreen((Node) load(getClass().getResource("/fxml/Search.fxml"), getControllerBundle(searchController)));
        } else if (currentScene == 1) {
            setScreen((Node) load(getClass().getResource("/fxml/Scene.fxml"), getControllerBundle(fxmlController)));
        }
    }
    
    /**
     *
     * @param controller
     * @return
     */
    public ResourceBundle getControllerBundle(AbstractController controller) {
        return getBundle(controller.getLocaleBundleBaseString(), getLocale());
    }
    
    /**
     *
     * @param node
     */
    public void setScreen(Node node) {
        mainPane.getChildren().setAll(node);
    }
    
    /**
     *
     * @return
     */
    public static FXMLController getFxmlController() {
        return fxmlController;
    }
    
    /**
     *
     * @return
     */
    public static SearchController getSearchController() {
        return searchController;
    }
    
    /**
     *
     * @return
     */
    public static UpdaterController getUpdateController() {
        return updateController;
    }
    
    /**
     *
     * @return
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    /**
     *
     * @return
     */
    public static KuukausiJasenDao getKuukausiDAO() {
        return kuukausiDao;
    }
    
    /**
     *
     * @return
     */
    public static KertaJasenDao getKertaDAO() {
        return kertaDao;
    }
    
    /**
     *
     * @return
     */
    public Locale getLocale() {
        if (currentLocale == null) {
            return defaultLocale;
        } else {
            return currentLocale;
        }
    }
    
    /**
     *
     * @param locale
     */
    public void setLocale(Locale locale) {
        currentLocale = locale;
    }
    
    /**
     *
     * @param id
     */
    public void setLocaleWithLangId(int id) {// 0  FI, 1 EN
        out.println(id);
        
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
        
        out.println("Choicebox is " + languageSelector);
        languageSelector.setItems(observableList(languages));
        languageSelector.getSelectionModel().selectFirst();
        
        languageSelector.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                out.println("Kieli vaihdettu");
                setLocaleWithLangId(newValue.intValue());
                languageSelector.getSelectionModel().select(newValue.intValue());
            }
        });
    }
    private static final Logger LOG = Logger.getLogger(MainController.class.getName());
}
