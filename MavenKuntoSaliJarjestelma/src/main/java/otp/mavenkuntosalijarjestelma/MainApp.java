package otp.mavenkuntosalijarjestelma;

import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import static javafx.fxml.FXMLLoader.load;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Antti
 */

public class MainApp extends Application {
    private MainController controller;
    private Scene scene;
    
    @Override
    public void init(){
       controller = new MainController();
    }
    
    @Override
    public void stop(){
        
       controller.getSessionFactory().close();

    }
    

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        Parent root = load(getClass().getResource("/fxml/main.fxml"), controller.getControllerBundle(controller));
        
        scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private static final Logger LOG = Logger.getLogger(MainApp.class.getName());

}
