package otp.mavenkuntosalijarjestelma;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

public class MainApp extends Application {
    private FXMLController controller;
    
    /*Tehtävä 14:
    https://en.wikipedia.org/wiki/Breadth-first_search
    -Jono käymättömistä soluista
    -Tietue käydyistä soluista
    -Etemee kerroksittain
    -Tallentaa lopuksi nopeimman polun
    -Aikavaatimus O(n) missä n = solujen määrä
    -Käytetään esim. web-sivustojen indeksoinnissa hakukoneisiin
    -
    
    
    */
    
    @Override
    public void init(){
       controller = new FXMLController();
    }
    
    @Override
    public void stop(){
        controller.getSessionFactory().close();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));

        Scene scene = new Scene(root);
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

}
