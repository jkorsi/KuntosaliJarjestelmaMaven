/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */
package otp.mavenkuntosalijarjestelma;

import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.Jasen;
import Entities.KertaJasen;
import Entities.KuukausiJasen;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Antti
 */
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
    private TableView<KuukausiJasen> KuukausiJasenTaulu; // Value injected by FXMLLoader

    @FXML // fx:id="KuukaisuJasenTableID"
    private TableColumn<KuukausiJasen, Integer> KuukaisuJasenTableID; // Value injected by FXMLLoader

    @FXML // fx:id="KuukaisuJasenTableNimi"
    private TableColumn<KuukausiJasen, String> KuukaisuJasenTableNimi; // Value injected by FXMLLoader

    @FXML // fx:id="KuukaisuJasenTableJasenyysVoimassa"
    private TableColumn<KuukausiJasen, Boolean> KuukaisuJasenTableJasenyysVoimassa; // Value injected by FXMLLoader

    @FXML // fx:id="KuukaisuJasenTableKkJaljella"
    private TableColumn<KuukausiJasen, Integer> KuukaisuJasenTableKkJaljella; // Value injected by FXMLLoader

    @FXML // fx:id="KuukaisuJasenTableMaksuTapa"
    private TableColumn<KuukausiJasen, String> KuukaisuJasenTableMaksuTapa; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTab"
    private Tab KertaJasenTab; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTaulu"
    private TableView<KertaJasen> KertaJasenTaulu; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTableID"
    private TableColumn<KertaJasen, Integer> KertaJasenTableID; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTableNimi"
    private TableColumn<KertaJasen, String> KertaJasenTableNimi; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTableJasenyysVoimassa"
    private TableColumn<KertaJasen, Boolean> KertaJasenTableJasenyysVoimassa; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTableKertojaJaljella"
    private TableColumn<KertaJasen, Integer> KertaJasenTableKertojaJaljella; // Value injected by FXMLLoader

    @FXML // fx:id="KertaJasenTableMaksutapa"
    private TableColumn<KertaJasen, String> KertaJasenTableMaksutapa; // Value injected by FXMLLoader

    @FXML // fx:id="JasenNimiField"
    private TextField JasenNimiField; // Value injected by FXMLLoader

    ObservableList<KuukausiJasen> kuukau;
    ObservableList<KertaJasen> kerta;

    private final KuukausiJasenDao kuukausiDao = MainController.getKuukausiDAO();
    private final KertaJasenDao kertaDao = MainController.getKertaDAO();
    //private final MainController mainController;
    
    public FXMLController(){
        //this.mainController = mC;
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
        System.out.println("KertajasenTaulu: " + KertaJasenTaulu);
        System.out.println("KuukausijasenTaulu: " + KuukausiJasenTaulu);
        if (KausiJasen.isSelected()) {
            KuukausiJasen kuuJasen = new KuukausiJasen();
            System.out.println(JasenNimiField.getText());
            String nimi = JasenNimiField.getText();
            kuuJasen.setNimi(nimi);
            if (Aikaa1KK.isSelected()) {
                kuuJasen.setKuukausiaJaljella(1);
            } else if (Aikaa3KK.isSelected()) {
                kuuJasen.setKuukausiaJaljella(3);
            }
            if (MaksuKateinen.isSelected()) {
                kuuJasen.setMaksuTapa("KÄTEINEN");
            } else if (MaksuKortti.isSelected()) {
                kuuJasen.setMaksuTapa("KORTTI");
            }
            if (Aikaa1KK.isSelected() || Aikaa3KK.isSelected()) {
                if (MaksuKateinen.isSelected() || MaksuKortti.isSelected()) {
                    kuukausiDao.createKuukausiJasen(kuuJasen);
                }

            }

        } else if (kertajasenRadio.isSelected()) {
            KertaJasen kertaJasen = new KertaJasen();
            kertaJasen.setNimi(JasenNimiField.getText());

            if (Kerrat1.isSelected()) {
                kertaJasen.setKayntikertojaJaljella(1);
            } else if (Kerrat10.isSelected()) {
                kertaJasen.setKayntikertojaJaljella(10);
            }
            if (MaksuKateinen.isSelected()) {
                kertaJasen.setMaksuTapa("KÄTEINEN");
            } else if (MaksuKortti.isSelected()) {
                kertaJasen.setMaksuTapa("KORTTI");
            }
            if (Kerrat1.isSelected() || Kerrat10.isSelected()) {
                if (MaksuKateinen.isSelected() || MaksuKortti.isSelected()) {
                    kertaDao.createKertaJasen(kertaJasen);
                }

            }

        }
        update();

    }

    /**
     * Päivittää ohjelman taulut hakemalla ne tietokannasta ja asettamalla ne
     * näkyviin
     */
    public void update() {
        kuukau = FXCollections.observableList(kuukausiDao.getALLKuukausiJasen());
        kerta = FXCollections.observableList(kertaDao.getALLKertajasen());
        KuukausiJasenTaulu.getItems().clear();
        KertaJasenTaulu.getItems().clear();
        KuukausiJasenTaulu.setItems(kuukau);
        KertaJasenTaulu.setItems(kerta);
    }

    @FXML
    void JasenPoistoButtonAction(ActionEvent event) {
        KuukausiJasen toDeleteKuukausi = KuukausiJasenTaulu.getSelectionModel().getSelectedItem();
        KertaJasen toDeleteKerta = KertaJasenTaulu.getSelectionModel().getSelectedItem();
        if (toDeleteKerta == null) {
            if (toDeleteKuukausi != null) {
                kuukausiDao.deleteKuukausiJasen(toDeleteKuukausi);
            }
        } else {
            kertaDao.deleteKertaJasen(toDeleteKerta);
        }

        update();
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

    @FXML
    void openKertaJasenEdit(MouseEvent event) throws IOException {
//        //mainController.setScreen((Node) FXMLLoader.load(getClass().getResource("/fxml/Updater.fxml")));
//        FXMLLoader loader = new FXMLLoader();
//        Stage popUpStage = new Stage();
//        popUpStage.setScene(new Scene((Parent) loader.load(getClass().getResource("/fxml/Updater.fxml"))));
    }

    @FXML
    void openKuukausiJasenEdit(MouseEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        System.out.println("KertajasenTaulu: " + KertaJasenTaulu);
        System.out.println("KuukausijasenTaulu: " + KuukausiJasenTaulu);

        KuukaisuJasenTableID.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Integer>, ObservableValue<Integer>>() {
            public ObservableValue<Integer> call(CellDataFeatures<KuukausiJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getJasenID());
            }
        });

        KuukaisuJasenTableNimi.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<KuukausiJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getNimi());
            }
        });
        KuukaisuJasenTableJasenyysVoimassa.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Boolean>, ObservableValue<Boolean>>() {
            public ObservableValue<Boolean> call(CellDataFeatures<KuukausiJasen, Boolean> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().isOnkoJasenyysVoimassa());
            }
        });
        KuukaisuJasenTableKkJaljella.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Integer>, ObservableValue<Integer>>() {
            public ObservableValue<Integer> call(CellDataFeatures<KuukausiJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getKuukausiaJaljella());
            }
        });
        KuukaisuJasenTableMaksuTapa.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<KuukausiJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getMaksuTapa());
            }
        });

        // kertajäsenelle alla
        KertaJasenTableID.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Integer>, ObservableValue<Integer>>() {
            public ObservableValue<Integer> call(CellDataFeatures<KertaJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getJasenID());
            }
        });

        KertaJasenTableNimi.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<KertaJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getNimi());
            }
        });
        KertaJasenTableJasenyysVoimassa.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Boolean>, ObservableValue<Boolean>>() {
            public ObservableValue<Boolean> call(CellDataFeatures<KertaJasen, Boolean> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().isOnkoJasenyysVoimassa());
            }
        });
        KertaJasenTableKertojaJaljella.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Integer>, ObservableValue<Integer>>() {
            public ObservableValue<Integer> call(CellDataFeatures<KertaJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getKayntikertojaJaljella());
            }
        });
        KertaJasenTableMaksutapa.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<KertaJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getMaksuTapa());
            }
        });

        kuukau = FXCollections.observableList(kuukausiDao.getALLKuukausiJasen());
        kerta = FXCollections.observableList(kertaDao.getALLKertajasen());

        KuukausiJasenTaulu.setItems(kuukau);
        KertaJasenTaulu.setItems(kerta);
//        KertaJasenTaulu.getItems().setAll(kertaDao.getALLKertajasen());
//        KuukausiJasenTaulu.getItems().setAll(kuukausiDao.getALLKuukausiJasen());

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

        assert KuukaisuJasenTableID != null : "fx:id=\"KuukaisuJasenTableID\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KuukaisuJasenTableNimi != null : "fx:id=\"KuukaisuJasenTableNimi\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KuukaisuJasenTableJasenyysVoimassa != null : "fx:id=\"KuukaisuJasenTableJasenyysVoimassa\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KuukaisuJasenTableKkJaljella != null : "fx:id=\"KuukaisuJasenTableKkJaljella\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KuukaisuJasenTableMaksuTapa != null : "fx:id=\"KuukaisuJasenTableMaksuTapa\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTab != null : "fx:id=\"KertaJasenTab\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTaulu != null : "fx:id=\"KertaJasenTaulu\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTableID != null : "fx:id=\"KertaJasenTableID\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTableNimi != null : "fx:id=\"KertaJasenTableNimi\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTableJasenyysVoimassa != null : "fx:id=\"KertaJasenTableJasenyysVoimassa\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTableKertojaJaljella != null : "fx:id=\"KertaJasenTableKertojaJaljella\" was not injected: check your FXML file 'Scene.fxml'.";

        assert KertaJasenTableMaksutapa != null : "fx:id=\"KertaJasenTableMaksutapa\" was not injected: check your FXML file 'Scene.fxml'.";

    }

    Object getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
