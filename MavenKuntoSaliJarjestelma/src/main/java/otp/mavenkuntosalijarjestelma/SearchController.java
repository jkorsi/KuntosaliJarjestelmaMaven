package otp.mavenkuntosalijarjestelma;

import Dao.KertaJasenDao;
import Dao.KuukausiJasenDao;
import Entities.KertaJasen;
import Entities.KuukausiJasen;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import static otp.mavenkuntosalijarjestelma.MainController.getKertaDAO;
import static otp.mavenkuntosalijarjestelma.MainController.getKuukausiDAO;

/**
 *
 * @author juhos
 */
public class SearchController extends AbstractController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    // SEARCH FIELD, BUTTON
    @FXML // fx:id="searchField"
    private TextField searchField;

    @FXML // fx:id="searchButton"
    private Button searchButton;

    // TABPANE
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

    ObservableList<KuukausiJasen> kklista;
    ObservableList<KertaJasen> kertalista;

    private final KuukausiJasenDao kuukausiDao = getKuukausiDAO();
    private final KertaJasenDao kertaDao = getKertaDAO();

    /**
     *
     */
    public SearchController() {
        localeBundleBaseString = "Bundles.SearchScene";
    }

    /**
     *
     */
    public void initialize() {
        fillKuukausiJasenDataToTable();
        fillKertaJasenDataToCell();

    }

    private void fillKertaJasenDataToCell() {
        kertaJasenLoadIDToCell();
        kertaJasenLoadNimiToCell();
        kertaJasenLoadJasenyysBooleanToCell();
        kertaJasenLoadKayntiKerratToCell();
        kertaJasenLoadMaksuTapaToCell();
    }

    private void fillKuukausiJasenDataToTable() {
        kuukausiJasenLoadIDToCell();
        kuukausiJasenLoadNimiToCell();
        kuukausiJasenLoadJasenBooleanToCell();
        kuukausiJasenLoadKuukaudetToCell();
        kuukausiJasenLoadMaksuTapaToCell();
    }

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) throws Exception {
        String nimi = searchField.getText();
        if (nimi.equals("")) {
        } else {
            findUsers(nimi);
        }
    }

    /**
     *
     * @param nimi
     */
    public void findUsers(String nimi) {
        KuukausiJasenTaulu.getItems().clear();
        KertaJasenTaulu.getItems().clear();

        // kuukausijasenet
        
        KuukausiJasenTaulu.setItems(kklista = observableList(kuukausiDao.getJasen(nimi)));

        // kertajasenet
        KertaJasenTaulu.setItems(kertalista = observableList(kertaDao.getJasen(nimi)));
    }

    private void kertaJasenLoadMaksuTapaToCell() {
        KertaJasenTableMaksutapa.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<KertaJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getMaksuTapa());
            }
        });
    }

    //INITIALIZE METHODS BELOW
    private void kertaJasenLoadKayntiKerratToCell() {
        KertaJasenTableKertojaJaljella.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(CellDataFeatures<KertaJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getKayntikertojaJaljella());
            }
        });
    }

    private void kertaJasenLoadJasenyysBooleanToCell() {
        KertaJasenTableJasenyysVoimassa.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Boolean>, ObservableValue<Boolean>>() {
            @Override
            public ObservableValue<Boolean> call(CellDataFeatures<KertaJasen, Boolean> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().isOnkoJasenyysVoimassa());
            }
        });
    }

    private void kertaJasenLoadNimiToCell() {
        KertaJasenTableNimi.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<KertaJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getNimi());
            }
        });
    }

    private void kertaJasenLoadIDToCell() {
        // kertajäsenelle alla
        KertaJasenTableID.setCellValueFactory(new Callback<CellDataFeatures<KertaJasen, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(CellDataFeatures<KertaJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getJasenID());
            }
        });
    }

    private void kuukausiJasenLoadMaksuTapaToCell() {
        KuukaisuJasenTableMaksuTapa.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<KuukausiJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getMaksuTapa());
            }
        });
    }

    private void kuukausiJasenLoadKuukaudetToCell() {
        KuukaisuJasenTableKkJaljella.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(CellDataFeatures<KuukausiJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getKuukausiaJaljella());
            }
        });
    }

    private void kuukausiJasenLoadJasenBooleanToCell() {
        KuukaisuJasenTableJasenyysVoimassa.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Boolean>, ObservableValue<Boolean>>() {
            @Override
            public ObservableValue<Boolean> call(CellDataFeatures<KuukausiJasen, Boolean> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().isOnkoJasenyysVoimassa());
            }
        });
    }

    private void kuukausiJasenLoadNimiToCell() {
        KuukaisuJasenTableNimi.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<KuukausiJasen, String> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getNimi());
            }
        });
    }

    private void kuukausiJasenLoadIDToCell() {
        KuukaisuJasenTableID.setCellValueFactory(new Callback<CellDataFeatures<KuukausiJasen, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(CellDataFeatures<KuukausiJasen, Integer> p) {
                // p.getValue() returns the Person instance for a particular TableView row
                return new ReadOnlyObjectWrapper(p.getValue().getJasenID());
            }
        });
    }
    private static final Logger LOG = Logger.getLogger(SearchController.class.getName());

}
