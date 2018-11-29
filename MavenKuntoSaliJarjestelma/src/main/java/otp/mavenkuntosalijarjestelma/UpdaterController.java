/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import Entities.Jasen;
import Entities.KertaJasen;
import Entities.KuukausiJasen;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Juho Suni
 */
public class UpdaterController extends AbstractController implements Initializable {

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        loadData(jasen, jasenTyyppi);
    }

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="name_label"
    private Label name_label; // Value injected by FXMLLoader

    @FXML // fx:id="kerrat_label"
    private Label kerrat_label; // Value injected by FXMLLoader

    @FXML // fx:id="kuukaudet_label"
    private Label kuukaudet_label; // Value injected by FXMLLoader

    @FXML // fx:id="maksutapa_label"
    private Label maksutapa_label; // Value injected by FXMLLoader

    @FXML // fx:id="jasneyys_label"
    private Label jasneyys_label; // Value injected by FXMLLoader

    @FXML // fx:id="getID_label"
    private Label getID_label; // Value injected by FXMLLoader

    @FXML // fx:id="nimi_textField"
    private TextField nimi_textField; // Value injected by FXMLLoader

    @FXML // fx:id="maksutapa_textField"
    private TextField maksutapa_textField; // Value injected by FXMLLoader

    @FXML // fx:id="kuukaudet_textField"
    private TextField kuukaudet_textField; // Value injected by FXMLLoader

    @FXML // fx:id="kerrat_textField"
    private TextField kerrat_textField; // Value injected by FXMLLoader

    @FXML // fx:id="jasenyys_checkbox"
    private CheckBox jasenyys_checkbox; // Value injected by FXMLLoader

    @FXML // fx:id="peruuta_button"
    private Button peruuta_button; // Value injected by FXMLLoader

    @FXML // fx:id="tallenna_button"
    private Button tallenna_button; // Value injected by FXMLLoader

    private Jasen jasen;

    private int jasenTyyppi;
    
    public UpdaterController(){
        localeBundleBaseString = "Bundles.UpdaterScene"; // String lokalisaatiota varten. Hakee tällä oikean bundlen scenelle
    }
    
    public void setData(Jasen jasen, int jasenTyyppi) {
        this.jasen = jasen;
        this.jasenTyyppi = jasenTyyppi;
    }

    public void loadData(Jasen jasen, int jasenTyyppi) { // lataa jasenen tiedot muokkausikkunaan
        System.out.println(jasen.getNimi());
        System.out.println(nimi_textField);
        nimi_textField.setText(jasen.getNimi());
        getID_label.setText("" + jasen.getJasenID());
        maksutapa_textField.setText(jasen.getMaksuTapa());
        jasenyys_checkbox.setSelected(jasen.isOnkoJasenyysVoimassa());

        if (jasenTyyppi == 0) { // jasen on kertajasen
            kerrat_textField.setText("" + ((KertaJasen) jasen).getKayntikertojaJaljella());

        } else { // jasen on kuukausijasen
            kuukaudet_textField.setText("" + ((KuukausiJasen) jasen).getKuukausiaJaljella());

        }
        System.out.println("Tiedot ladattu muokkausikkunaan");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
//        loadData(jasen, jasenTyyppi);
        
        assert name_label != null : "fx:id=\"name_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert kerrat_label != null : "fx:id=\"kerrat_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert kuukaudet_label != null : "fx:id=\"kuukaudet_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert maksutapa_label != null : "fx:id=\"maksutapa_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert jasneyys_label != null : "fx:id=\"jasneyys_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert getID_label != null : "fx:id=\"getID_label\" was not injected: check your FXML file 'Updater.fxml'.";
        assert nimi_textField != null : "fx:id=\"nimi_textField\" was not injected: check your FXML file 'Updater.fxml'.";
        assert maksutapa_textField != null : "fx:id=\"maksutapa_textField\" was not injected: check your FXML file 'Updater.fxml'.";
        assert kuukaudet_textField != null : "fx:id=\"kuukaudet_textField\" was not injected: check your FXML file 'Updater.fxml'.";
        assert kerrat_textField != null : "fx:id=\"kerrat_textField\" was not injected: check your FXML file 'Updater.fxml'.";
        assert jasenyys_checkbox != null : "fx:id=\"jasenyys_checkbox\" was not injected: check your FXML file 'Updater.fxml'.";
        assert peruuta_button != null : "fx:id=\"peruuta_button\" was not injected: check your FXML file 'Updater.fxml'.";
        assert tallenna_button != null : "fx:id=\"tallenna_button\" was not injected: check your FXML file 'Updater.fxml'.";

    }
}
