package otp.mavenkuntosalijarjestelma;

import Entities.KuukausiJasen;
import java.io.IOException;
import java.util.List;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static javafx.fxml.FXMLLoader.load;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.loadui.testfx.Assertions.verifyThat;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.GuiTest.find;
import static org.loadui.testfx.controls.Commons.hasText;
import static org.loadui.testfx.controls.TableViews.containsCell;
import static otp.mavenkuntosalijarjestelma.MainController.getKuukausiDAO;

/**
 *
 * @author juhos
 */
public class SearchControllerTest extends GuiTest {
    
    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     *
     * @return
     */
    @Override
    protected Parent getRootNode() {
        Parent parent = null;
        try {
            parent = load(getClass().getResource("/fxml/Search.fxml"));
        } catch (IOException ex) {
            getLogger(FXMLControllerTest.class.getName()).log(SEVERE, null, ex);
        }
        return parent;
    }
    
    /**
     *
     */
    @Test 
    public void should_contain_button() {
        verifyThat("#searchButton", hasText("haku"));
    }
    
    // Tietokannasta saadun jäsenen nimi asetetaan hakukenttään. Haun tuloksen pitäisi näkyä taulukossa.

    /**
     *
     */
    @Test
    public void should_find_first_item() {
        List<KuukausiJasen> list = getKuukausiDAO().getALLKuukausiJasen();
        KuukausiJasen kj = list.get(0);
        
        TextField field = find("#searchField");
        click(field);
        type(kj.getNimi());
        
        Button sBtn = find("#searchButton");
        click(sBtn);

        verifyThat("#KuukausiJasenTaulu", containsCell(kj.getNimi()));
        //verifyThat(".table-view", containsCell(kj.getNimi()));
    }
    private static final Logger LOG = Logger.getLogger(SearchControllerTest.class.getName());
    
}
