package javacomp;


import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.stage.Stage;

public class Main extends Application {
    
    private Stage stage;
    
    @Override
    public void start(Stage stage) {
        this.stage = stage; 
        mainStage();
    }
        
    public void mainStage() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/scenes/Home.fxml"));
            Scene scene = new Scene(root);
        
//            Image icon = new Image("/images/modailee-icon.png");
//             stage.getIcons().add(icon); 
             stage.setTitle("Keash");
             stage.setFullScreen(true);
            
//            String css = this.getClass().getResource("style.css").toExternalForm();
//            scene.getStylesheets().add(css);
                
             stage.setScene(scene);
             stage.show();
             
          
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
   

    public static void main(String[] args) {
        launch(args);
    }
    
}
