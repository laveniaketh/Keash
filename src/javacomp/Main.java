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

            Parent root = FXMLLoader.load(getClass().getResource("/scenes/Admin.fxml"));
            Scene scene = new Scene(root);
   
            Image icon = new Image("/images/keash-logo.png");
            stage.getIcons().add(icon); 
            stage.setTitle("Keash");
            //stage.setFullScreen(false);
            stage.setMaximized(true);
            stage.setWidth(1366);
            stage.setHeight(738);
             
            String css = this.getClass().getResource("styling.css").toExternalForm();
            scene.getStylesheets().add(css);
                
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
