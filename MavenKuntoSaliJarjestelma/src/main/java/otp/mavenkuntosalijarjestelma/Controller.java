/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package otp.mavenkuntosalijarjestelma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="JasenTaulu"
    private TableView<?> JasenTaulu; // Value injected by FXMLLoader

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

    @FXML
    void JasenLisausButtonAction(ActionEvent event) {
        System.out.println("JASEN LISÄYS");
    }

    @FXML
    void KausiJäsenAction(ActionEvent event) {
        System.out.println("KAUSIJÄSEN");
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
        System.out.println("KERTAJÄSEN");
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
        assert JasenTaulu != null : "fx:id=\"JasenTaulu\" was not injected: check your FXML file 'Scene.fxml'.";
        assert JasenLisausButton != null : "fx:id=\"JasenLisausButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert KausiJasen != null : "fx:id=\"KausiJasen\" was not injected: check your FXML file 'Scene.fxml'.";
        assert jasentyyppi != null : "fx:id=\"jasentyyppi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertajasenRadio != null : "fx:id=\"kertajasenRadio\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Kerrat10 != null : "fx:id=\"Kerrat10\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertoja != null : "fx:id=\"kertoja\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Kerrat1 != null : "fx:id=\"Kerrat1\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaksuKortti != null : "fx:id=\"MaksuKortti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert maksutapa != null : "fx:id=\"maksutapa\" was not injected: check your FXML file 'Scene.fxml'.";
        assert MaksuKateinen != null : "fx:id=\"MaksuKateinen\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
