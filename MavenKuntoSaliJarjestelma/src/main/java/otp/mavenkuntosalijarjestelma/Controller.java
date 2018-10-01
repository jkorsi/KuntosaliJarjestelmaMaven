package otp.mavenkuntosalijarjestelma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="jasentyyppi"
    private ToggleGroup jasentyyppi; // Value injected by FXMLLoader

    @FXML // fx:id="kertajasenRadio"
    private RadioButton kertajasenRadio; // Value injected by FXMLLoader

    @FXML // fx:id="kertoja"
    private ToggleGroup kertoja; // Value injected by FXMLLoader

    @FXML // fx:id="maksutapa"
    private ToggleGroup maksutapa; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert jasentyyppi != null : "fx:id=\"jasentyyppi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertajasenRadio != null : "fx:id=\"kertajasenRadio\" was not injected: check your FXML file 'Scene.fxml'.";
        assert kertoja != null : "fx:id=\"kertoja\" was not injected: check your FXML file 'Scene.fxml'.";
        assert maksutapa != null : "fx:id=\"maksutapa\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
