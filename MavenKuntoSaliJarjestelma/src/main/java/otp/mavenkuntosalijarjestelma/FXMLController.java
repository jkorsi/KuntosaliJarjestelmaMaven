/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */
package otp.mavenkuntosalijarjestelma;

import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.KertaJasen;
import Entities.KuukausiJasen;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import org.hibernate.SessionFactory;

public class FXMLController {

   
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="JasenLisausButton"
    private Button JasenLisausButton; // Value injected by FXMLLoader

    @FXML // fx:id="KausiJasen"
    private RadioButton KausiJasen; // Value injected by FXMLLoader

    @FXML // fx:id="jasentyyppi"
    private ToggleGroup jasentyyppi; // Value injected by FXMLLoader

    @FXML // fx:id="kertajasenRadio"
    private RadioButton kertajasenRadio; // Value injected by FXMLLoader

    @FXML // fx:id="Kerrat10"
    private RadioButton Kerrat10; // Value injected by FXMLLoader

    @FXML // fx:id="kertoja"
    private ToggleGroup kertoja; // Value injected by FXMLLoader

    @FXML // fx:id="Kerrat1"
    private RadioButton Kerrat1; // Value injected by FXMLLoader

    @FXML // fx:id="MaksuKortti"
    private RadioButton MaksuKortti; // Value injected by FXMLLoader

    @FXML // fx:id="maksutapa"
    private ToggleGroup maksutapa; // Value injected by FXMLLoader

    @FXML // fx:id="MaksuKateinen"
    private RadioButton MaksuKateinen; // Value injected by FXMLLoader

    @FXML // fx:id="Aikaa1KK"
    private RadioButton Aikaa1KK; // Value injected by FXMLLoader

    @FXML // fx:id="Kuukausia"
    private ToggleGroup Kuukausia; // Value injected by FXMLLoader

    @FXML // fx:id="Aikaa3KK"
    private RadioButton Aikaa3KK; // Value injected by FXMLLoader

    @FXML // fx:id="JasenPoistoButton"
    private Button JasenPoistoButton; // Value injected by FXMLLoader

    @FXML // fx:id="JasenTabPane"
    private TabPane JasenTabPane; // Value injected by FXMLLoader

    @FXML // fx:id="KuukausiJasenTab"
    private Tab KuukausiJasenTab; // Value injected by FXMLLoader

    @FXML // fx:id="KuukausiJasenTaulu"
    private TableView<?> KuukausiJasenTaulu; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTab"
    private Tab KertaJasenTab; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTaulu"
    private TableView<?> KertaJasenTaulu; // Value injected by FXMLLoader
    
    @FXML // fx:id="JasenNimiField"
    private TextField JasenNimiField; // Value injected by FXMLLoader
    private SessionFactory sessionFactory;
    private final KertaJasenDao kertaDao;
    private final KuukausiJasenDao kuukausiDao;
    
    public FXMLController() {
        sessionFactory =  HibernateUtil.getSessionFactory();
        kertaDao = new KertaJasenDao(sessionFactory);
        kuukausiDao = new KuukausiJasenDao(sessionFactory);
        
//        KuukausiJasenTaulu.setItems(kuukausiDao.getALLKuukausiJasen());
//        KertaJasenTaulu.setItems(kertaDao.getALLKertajasen());
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }   

    @FXML
    void Aikaa1KKAction(ActionEvent event) {
        System.out.println("AIKAA 1KK");
    }

    @FXML
    void Aikaa3KKAction(ActionEvent event) {
        System.out.println("AIKAA 3KK");
    }

    @FXML
    void JasenLisausButtonAction(ActionEvent event) {
        System.out.println("JASEN LISÄYS fxml");
        if(KausiJasen.isSelected()){
            KuukausiJasen kuuJasen = new KuukausiJasen();
            System.out.println(JasenNimiField.getText());
            String nimi = JasenNimiField.getText();
            kuuJasen.setNimi(nimi);
            if(Aikaa1KK.isSelected()){
                kuuJasen.setKuukausiaJaljella(1);
            }else if(Aikaa3KK.isSelected()){
                kuuJasen.setKuukausiaJaljella(3);
            }
            if(MaksuKateinen.isSelected()){
                kuuJasen.setMaksuTapa("KÄTEINEN");
            }else if(MaksuKortti.isSelected()){
                kuuJasen.setMaksuTapa("KORTTI");
            }
            kuukausiDao.createKuukausiJasen(kuuJasen);
            
        }else if(kertajasenRadio.isSelected()){
            KertaJasen kertaJasen = new KertaJasen();
            kertaJasen.setNimi(JasenNimiField.getText());
            
            if(Kerrat1.isSelected()){
                kertaJasen.setKayntikertojaJaljella(1);
            }else if(Kerrat10.isSelected()){
                 kertaJasen.setKayntikertojaJaljella(10);
            }
            if(MaksuKateinen.isSelected()){
                kertaJasen.setMaksuTapa("KÄTEINEN");
            }else if(MaksuKortti.isSelected()){
                kertaJasen.setMaksuTapa("KORTTI");
            }
            kertaDao.createKertaJasen(kertaJasen);
        }
        
    }

    @FXML
    void JasenPoistoButtonAction(ActionEvent event) {

    }
    
    SingleSelectionModel<Tab> selectionModel; 
    @FXML
    void KausiJäsenAction(ActionEvent event) {
        selectionModel = JasenTabPane.getSelectionModel();
        System.out.println("KAUSIJÄSEN");
        Aikaa1KK.setDisable(false);
        Aikaa3KK.setDisable(false);
        Kerrat10.setDisable(true);
        Kerrat1.setDisable(true);
        selectionModel.select(KuukausiJasenTab);
    }

    @FXML
    void Kerrat10Action(ActionEvent event) {
        System.out.println("10 KERTAA");
    }

    @FXML
    void Kerrat1Action(ActionEvent event) {
        System.out.println("1 KERTA");
    }

    @FXML
    void KertaJasenAction(ActionEvent event) {
        selectionModel = JasenTabPane.getSelectionModel();
        System.out.println("KERTAJÄSEN");
        Aikaa1KK.setDisable(true);
        Aikaa3KK.setDisable(true);
        Kerrat10.setDisable(false);
        Kerrat1.setDisable(false);
        selectionModel.select(KertaJasenTab);
    }

    @FXML
    void MaksutapaKorttiAction(ActionEvent event) {
        System.out.println("MAKSU KORTTI");

    }

    @FXML
    void MaksutapaKäteinenAction(ActionEvent event) {
        System.out.println("MAKSU KÄTEINEN");
    }

   @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert JasenLisausButton != null : "fx:id=\"JasenLisausButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KausiJasen != null : "fx:id=\"KausiJasen\" was not injected: check your FXML file 'Scene.fxml'.";
        assert jasentyyppi != null : "fx:id=\"jasentyyppi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertajasenRadio != null : "fx:id=\"kertajasenRadio\" was not injected: check your FXML file 'Scene.fxml'.";
        assert JasenNimiField != null : "fx:id=\"JasenNimiField\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Kerrat10 != null : "fx:id=\"Kerrat10\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertoja != null : "fx:id=\"kertoja\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Kerrat1 != null : "fx:id=\"Kerrat1\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaksuKortti != null : "fx:id=\"MaksuKortti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert maksutapa != null : "fx:id=\"maksutapa\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaksuKateinen != null : "fx:id=\"MaksuKateinen\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Aikaa1KK != null : "fx:id=\"Aikaa1KK\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Kuukausia != null : "fx:id=\"Kuukausia\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Aikaa3KK != null : "fx:id=\"Aikaa3KK\" was not injected: check your FXML file 'Scene.fxml'.";
        assert JasenPoistoButton != null : "fx:id=\"JasenPoistoButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert JasenTabPane != null : "fx:id=\"JasenTabPane\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KuukausiJasenTab != null : "fx:id=\"KuukausiJasenTab\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KuukausiJasenTaulu != null : "fx:id=\"KuukausiJasenTaulu\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KertaJasenTab != null : "fx:id=\"KertaJasenTab\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KertaJasenTaulu != null : "fx:id=\"KertaJasenTaulu\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
