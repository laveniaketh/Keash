/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class StartController implements Initializable {

    @FXML
    private AnchorPane bgPane;
    @FXML
    private Button buyticketB;
    
    Stage stage;
    Scene scene;
    Parent root;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToHomeScene(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/scenes/Home.fxml"));
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
