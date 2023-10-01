
package javacomp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Button signInB;
    @FXML
    private Button signUpB;
    @FXML
    private ImageView prevB;
    @FXML
    private Button getStartedB;
    
       Stage stage;
    Scene scene;
    Parent root;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prevBHoverEntered(MouseEvent event) {
        Image icon = new Image("/images/previous-hover.png");
        prevB.setImage(icon);
    }

    @FXML
    private void prevBHoverExit(MouseEvent event) {
        Image icon = new Image("/images/previous.png");
        prevB.setImage(icon);       
    }

    @FXML
    private void proceedToHoome(MouseEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("/scenes/Admin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        Image icon = new Image("/images/keash-logo.png");
        stage.getIcons().add(icon); 
        stage.setTitle("Keash");
                    
        stage.setMaximized(true);
        stage.setWidth(1366);
        stage.setHeight(738);
        
        String css = this.getClass().getResource("styling.css").toExternalForm();
        scene.getStylesheets().add(css);
            
        stage.setScene(scene);
        stage.show();      
    }
    
}
