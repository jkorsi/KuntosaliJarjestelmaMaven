package otp.mavenkuntosalijarjestelma;

import Entities.Kayttaja;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController extends AbstractController{
    MainController controller = MainController.getMainController();
    
    @FXML // fx:id="infoText"
    private Text infoText;
    @FXML // fx:id="passuField"
    private PasswordField passuField = new PasswordField();
    @FXML // fx:id="tunnusField"
    private TextField tunnusField = new TextField();
    
    public static Kayttaja logKayttaja;     // sisäänkirjautunut käyttäjä
    
    
    @FXML
    private void loginHandler(ActionEvent event) throws Exception {
    	String username = tunnusField.getText();
    	String password = passuField.getText();
    	if (username.equals("")) {
	        infoText.setText("Username can't be blank");
    	} else if (password.equals("")) {
    		infoText.setText("Password can't be blank");
    	} else {
            logKayttaja = checkUser(username, password);

            if (logKayttaja != null) {
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"), controller.getControllerBundle(controller));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                
                String lvl;
                if (logKayttaja.getEsimiesStatus()) {
                    lvl = "Esimies";
                } else {
                    lvl = "Työntekijä";
                }
                stage.setTitle("USER: " +username+ " & RANK: " + lvl);
                stage.show();
            } else {
                infoText.setText("Invalid username or password");
            }

    	}
    }

    @FXML
    private void handleClose(ActionEvent close){
        Node source = (Node) close.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public Kayttaja checkUser(String tunnus, String pw) {
        Kayttaja kayttaja = null;

        try {
            kayttaja = MainController.getKayttajaDao().getKayttaja(tunnus);
            if (kayttaja != null) {
                if (kayttaja.getSalasana().equals(pw)) {
                    System.out.println(kayttaja.getEtunimi());	// test
                    System.out.println(kayttaja.getSalasana());
                    return kayttaja;
                }
            }
        } catch (Exception e) {

        }
        return null;
    }

}
