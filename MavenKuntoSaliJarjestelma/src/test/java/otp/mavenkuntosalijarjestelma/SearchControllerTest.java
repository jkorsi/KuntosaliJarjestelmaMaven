package otp.mavenkuntosalijarjestelma;

import Dao.KuukausiJasenDao;
import Entities.KuukausiJasen;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.loadui.testfx.Assertions.verifyThat;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.GuiTest.find;
import static org.loadui.testfx.controls.Commons.hasText;
import static org.loadui.testfx.controls.TableViews.containsCell;

public class SearchControllerTest extends GuiTest {
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Override
    protected Parent getRootNode() {
        Parent parent = null;
        try {
            MainController mc = new MainController();
            parent = FXMLLoader.load(getClass().getResource("/fxml/Search.fxml"), mc.getControllerBundle(new SearchController()));
        } catch (IOException ex) {
            Logger.getLogger(FXMLControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parent;
    }
    
    @Test 
    public void should_contain_button() {
        verifyThat("#searchButton", hasText("haku"));
    }
    
    // Tietokannasta saadun jäsenen nimi asetetaan hakukenttään. Haun tuloksen pitäisi näkyä taulukossa.
    @Test
    public void should_find_first_item() {
        List<KuukausiJasen> list = MainController.getKuukausiDAO().getALLKuukausiJasen();
        KuukausiJasen kj = list.get(0);
        
        TextField field = find("#searchField");
        click(field);
        type(kj.getNimi());
        
        Button sBtn = find("#searchButton");
        click(sBtn);

        verifyThat("#KuukausiJasenTaulu", containsCell(kj.getNimi()));
        //verifyThat(".table-view", containsCell(kj.getNimi()));
    }
    
}
