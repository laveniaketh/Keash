
package javacomp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {

    @FXML
    private Button signInB;
    @FXML
    private Button signUpB;
    @FXML
    private ImageView prevB;
    @FXML
    private Button getStartedB;


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
    
}
