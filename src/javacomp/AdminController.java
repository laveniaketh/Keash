
package javacomp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class AdminController implements Initializable {
    
    ToggleButton adButtons[];

    @FXML
    private ToggleButton dashboardB;
    @FXML
    private ToggleGroup adminpaneB;
    @FXML
    private ToggleButton customerB;
    @FXML
    private ToggleButton editScreeningB;
    @FXML
    private ImageView dashboardImg;
    @FXML
    private ImageView customerImg;
    @FXML
    private ImageView editScreeningImg;
    @FXML
    private Pane editScreeningPane;
    @FXML
    private Pane customerPane;
    @FXML
    private Pane dashboardPane;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
                Image icon = new Image("/images/dashboard-icon-hover.png");
                dashboardImg.setImage(icon); 
    }

    void initializeAdminPaneButtons(){
        adButtons = new ToggleButton[3];
        adButtons[0] = dashboardB;
        adButtons[1] = customerB;
        adButtons[2] = editScreeningB;
                
    
    }
    
    

    @FXML
    private void userpaneHoverEnter(MouseEvent event) {
        initializeAdminPaneButtons();
        for(int i = 0; i < adButtons.length; i++){
        if(!adButtons[i].isSelected() && adButtons[i].isHover()){
            if(i == 0){
                Image icon = new Image("/images/dashboard-icon-hover.png");
                dashboardImg.setImage(icon);                
            }
            else if(i == 1){
                Image icon = new Image("/images/customer-icon-hover.png");
                customerImg.setImage(icon);                
            }
            else if(i == 2){
                Image icon = new Image("/images/edit-screening-icon-hover.png");           
                editScreeningImg.setImage(icon);              
            }
        }        

        
    }
    }

    @FXML
    private void userpaneSelected(ActionEvent event) {
//        if(adminpaneB.getSelectedToggle() == dashboardB){
//            Image icon = new Image("/images/dashboard-icon-hover.png");
//            dashboardImg.setImage(icon);            
//        }else if(adminpaneB.getSelectedToggle() == customerB){
//            Image icon = new Image("/images/customer-icon-hover.png");
//            customerImg.setImage(icon);            
//        }else if(adminpaneB.getSelectedToggle() == editScreeningB){
//            Image icon = new Image("/images/edit-screening-icon-hover.png");           
//            editScreeningImg.setImage(icon);
//        }
        initializeAdminPaneButtons();
        for(int i = 0; i < adButtons.length; i++){
        if(adButtons[i].isSelected()){
            if(i == 0){
                Image icon = new Image("/images/dashboard-icon-hover.png");
                dashboardImg.setImage(icon);
                dashboardPane.toFront();
            }
            else if(i == 1){
                Image icon = new Image("/images/customer-icon-hover.png");
                customerImg.setImage(icon);
                customerPane.toFront();
            }
            else if(i == 2){
                Image icon = new Image("/images/edit-screening-icon-hover.png");           
                editScreeningImg.setImage(icon);  
                editScreeningPane.toFront();
            }
        }
        else if(!adButtons[i].isSelected()){
            if(i == 0){
                Image icon = new Image("/images/dashboard-icon.png");
                dashboardImg.setImage(icon);                
            }
            else if(i == 1){
                Image icon = new Image("/images/customer-icon.png");
                customerImg.setImage(icon);                
            }
            else if(i == 2){
                Image icon = new Image("/images/edit-screening-icon.png");           
                editScreeningImg.setImage(icon);              
            }          
        }
            
    }
        
    }

    @FXML
    private void userpaneHoverExit(MouseEvent event) {
        for(int i = 0; i < adButtons.length; i++){
        if(!adButtons[i].isSelected()){
            if(i == 0){
                Image icon = new Image("/images/dashboard-icon.png");
                dashboardImg.setImage(icon);                
            }
            else if(i == 1){
                Image icon = new Image("/images/customer-icon.png");
                customerImg.setImage(icon);                
            }
            else if(i == 2){
                Image icon = new Image("/images/edit-screening-icon.png");           
                editScreeningImg.setImage(icon);              
                }          
            }      
        }
    }
    
}
