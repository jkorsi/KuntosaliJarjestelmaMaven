package otp.mavenkuntosalijarjestelma;

import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.Jasen;
import Entities.KertaJasen;
import Entities.KuukausiJasen;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import org.hibernate.SessionFactory;

public class MainController extends AbstractController {

    @FXML // fx:id="sceneBtn"
    private Button sceneBtn;
    @FXML // fx:id="searchBtn"
    private Button searchBtn;

    @FXML // fx:id="mainPane"
    private AnchorPane mainPane;

    private SessionFactory sessionFactory;
    private static KertaJasenDao kertaDao;
    private static KuukausiJasenDao kuukausiDao;

    private static FXMLController fxmlController;
    private static SearchController searchController;
    private static UpdaterController updateController;

    public MainController() {
        sessionFactory = HibernateUtil.getSessionFactory();
        kertaDao = new KertaJasenDao(sessionFactory);
        kuukausiDao = new KuukausiJasenDao(sessionFactory);
        fxmlController = new FXMLController();
        searchController = new SearchController();
        updateController = new UpdaterController();

        //generateJengi();
    }

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
        ResourceBundle resources = ResourceBundle.getBundle(searchController.getLocaleBundleBaseString());
        setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Search.fxml"), resources));

    }

    // toinen näkymä
    @FXML
    void sceneNakymaVaihto(ActionEvent event) throws Exception {
        ResourceBundle resources = ResourceBundle.getBundle(fxmlController.getLocaleBundleBaseString());
        setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"), resources));

    }

    public void setScreen(Node node) {
        mainPane.getChildren().setAll(node);
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

}
