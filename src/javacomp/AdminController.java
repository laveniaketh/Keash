
package javacomp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;


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
    private ImageView signoutImg;
    @FXML
    private Pane editScreeningPane;
    @FXML
    private Pane customerPane;
    @FXML
    private Pane dashboardPane;
    @FXML
    private TextField movieIDTF;
    @FXML
    private TextField movieTitleTF;
    @FXML
    private TextArea movieDescTF;
    @FXML
    private TextField movieTimeSlot1TF;
    @FXML
    private TextField movieTimeSlot2TF;
    @FXML
    private TextField movieTimeSlot3TF;
    @FXML
    private Button uploadB;
    @FXML
    private Label movieTitleLabel;
    @FXML
    private TableView<MovieList> movieListTable;
    
    PreparedStatement ps;
    ResultSet rs;
    String mid,mtitle,mdesc, ts1, ts2, ts3;
    byte[] byte_image = null;
    
    Blob blob; 
    InputStream in; 
    Image img;
    
    @FXML
    private ImageView posterImg;
    @FXML
    private TableColumn<MovieList, String> movieIDcol;
    @FXML
    private TableColumn<MovieList, String> movieTitleCol;
    @FXML
    private TableColumn<MovieList, String> timeslot1Col;
    @FXML
    private TableColumn<MovieList, String> timeslot2Col;
    @FXML
    private TableColumn<MovieList, String> timeslot3Col;
    @FXML
    private Label descLabel;
    @FXML
    private Label dialogLabel;
    
    Stage stage;
    Scene scene;
    Parent root;




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        javacomp.Database.connect();
 
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
                movielistTable();
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
    
    void movielistTable(){ 
        
        try {
        //this will display the uplist table
        javacomp.Database.connect();
        ObservableList<MovieList> mtable = FXCollections.observableArrayList();
        ps = Database.connect().prepareStatement("SELECT `movieID`, `Title`,`Timeslot 1`, `Timeslot 2`, `Timeslot 3` FROM `movielist`");
        ResultSet rs = ps.executeQuery();
        {
        while(rs.next()){
            
            
            MovieList ml = new MovieList();
            ml.setMovieID(rs.getString("movieID"));
            ml.setMovieTitle(rs.getString("Title"));
            ml.setT1(rs.getString("Timeslot 1"));
            ml.setT2(rs.getString("Timeslot 2"));
            ml.setT3(rs.getString("Timeslot 3"));
            mtable.add(ml);

        }          
        }
            movieListTable.setItems(mtable); 
            movieIDcol.setCellValueFactory(c->c.getValue().movieIDProperty());
            movieTitleCol.setCellValueFactory(c->c.getValue().movieTitleProperty());
            timeslot1Col.setCellValueFactory(c->c.getValue().t1Property());
            timeslot2Col.setCellValueFactory(c->c.getValue().t2Property());
            timeslot3Col.setCellValueFactory(c->c.getValue().t3Property());


        
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
       
    }

    @FXML
    private void addMoviePoster(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilterJPG
                = new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
        FileChooser.ExtensionFilter extFilterjpg
                = new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilterPNG
                = new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
        FileChooser.ExtensionFilter extFilterpng
                = new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
        fileChooser.getExtensionFilters()
                .addAll(extFilterJPG, extFilterjpg, extFilterPNG, extFilterpng);
        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            WritableImage image = SwingFXUtils.toFXImage(bufferedImage, null);
            posterImg.setImage(image);
            posterImg.setFitWidth(400);
            posterImg.setFitHeight(400);          
            posterImg.setSmooth(true);
            posterImg.setCache(true);
            FileInputStream fin = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fin.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            byte_image = bos.toByteArray();

        } catch (IOException ex) {
            Logger.getLogger("ss");
        }       
    }

    @FXML
    private void addMovieToDatabase(MouseEvent event) {
        // add movie to the database
        mtitle = movieTitleTF.getText();
        mdesc = movieDescTF.getText();
        ts1 = movieTimeSlot1TF.getText();
        ts2 = movieTimeSlot2TF.getText();
        ts3 = movieTimeSlot3TF.getText();

        try {
            ps = Database.connect().prepareStatement("INSERT INTO `movielist`(`Title`, `Description`, `Timeslot 1`, `Timeslot 2`, `Timeslot 3`, `Poster`) VALUES (?,?,?,?,?,?)");
            ps.setString(1, mtitle);
            ps.setString(2, mdesc);
            ps.setString(3, ts1);
            ps.setString(4, ts2);
            ps.setString(5, ts3);
            ps.setBytes(6, byte_image);          
            movieTitleLabel.setText(mtitle);
            descLabel.setText(mdesc);

            ps.executeUpdate();
            dialogLabel.setText("Movie Added Successfully");
            movielistTable();
            movieTitleTF.setText("");
            movieTitleLabel.setText("");
            movieDescTF.setText("");
            descLabel.setText("");
            movieTimeSlot1TF.setText("");
            movieTimeSlot2TF.setText("");
            movieTimeSlot3TF.setText("");
            Image img = new Image("/images/upload_poster.png");
            posterImg.setImage(img);
            

            //lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/poster.png")));
            movieTitleTF.requestFocus();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }      
    }
    @FXML
    private void getIDFromTF(ActionEvent event) {
        dialogLabel.setText("");
        //search and select movie from the tables
        if(movieIDTF.getText() != ""){
        mid = movieIDTF.getText();

        try{
            ps = Database.connect().prepareStatement("SELECT `Title`, `Description`, `Timeslot 1`, `Timeslot 2`, `Timeslot 3`, `Poster` FROM `movielist` WHERE `movieID` = ?");
            ps.setString(1, mid);
            ResultSet rs = ps.executeQuery();
            if(rs.next() == true){
                mtitle = rs.getString(1);
                mdesc = rs.getString(2);
                ts1 = rs.getString(3);
                ts2 = rs.getString(4);
                ts3 = rs.getString(5);
                blob = rs.getBlob(6);
                in = blob.getBinaryStream(); 
                img = new Image(in);
                posterImg.setImage(img);
                posterImg.setFitWidth(400);
                posterImg.setFitHeight(400);          
                posterImg.setSmooth(true);
                posterImg.setCache(true);           

                movieTitleTF.setText(mtitle);
                movieTitleLabel.setText(mtitle);
                movieDescTF.setText(mdesc);
                descLabel.setText(mdesc);
                movieTimeSlot1TF.setText(ts1);
                movieTimeSlot2TF.setText(ts2);
                movieTimeSlot3TF.setText(ts3);
            }
            else{
                movieTitleTF.setText("");
                movieTitleLabel.setText("");
                movieDescTF.setText("");
                descLabel.setText("");
                movieTimeSlot1TF.setText("");
                movieTimeSlot2TF.setText("");
                movieTimeSlot3TF.setText("");
                Image img = new Image("/images/upload_poster.png");
                posterImg.setImage(img);
                dialogLabel.setText("Invalid Movie ID");;
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        }        
        
    }
    
    @FXML
    private void deleteMovieFromDatabase(MouseEvent event) {
        //delete movie from the list
        mid = movieIDTF.getText();

        try{
            ps = Database.connect().prepareStatement("DELETE FROM `movielist` WHERE `movieID` = ?");
            ps.setString(1, mid);

            ps.executeUpdate();
            dialogLabel.setText("Movie Deleted Successfully");
            
            movielistTable();
            movieIDTF.setText("");
            movieTitleTF.setText("");
            movieTitleLabel.setText("");
            movieDescTF.setText("");
            descLabel.setText("");
            movieTimeSlot1TF.setText("");
            movieTimeSlot2TF.setText("");
            movieTimeSlot3TF.setText("");
                    
            Image img = new Image("/images/upload_poster.png");
            posterImg.setImage(img);

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }       
    }

    @FXML
    private void updateMovieFromDatabase(MouseEvent event) {
        //update movie details from the table database
        mtitle = movieTitleTF.getText();
        mdesc = movieDescTF.getText();
        ts1 = movieTimeSlot1TF.getText();
        ts2 = movieTimeSlot2TF.getText();
        ts3 = movieTimeSlot3TF.getText();
        try {
            ps = Database.connect().prepareStatement("UPDATE `movielist` SET `Title`= ?, `Description`= ?,`Timeslot 1`= ?,`Timeslot 2`= ?,`Timeslot 3`= ? WHERE `movieID` = ?"); 
            ps.setString(1, mtitle);
            ps.setString(2, mdesc);
            ps.setString(3, ts1);
            ps.setString(4, ts2);
            ps.setString(5, ts3);
            ps.setString(6, mid); 

            ps.executeUpdate();
            dialogLabel.setText("Movie Updated Successfully");
            movieTitleLabel.setText(mtitle);
            descLabel.setText(mdesc);                   
            movielistTable();

            movieTitleTF.requestFocus();

           } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }  
    }

    @FXML
    private void changeInputEveryKeyReleased(KeyEvent event) {
        dialogLabel.setText("");
        movieTitleLabel.setText(movieTitleTF.getText());
        descLabel.setText( movieDescTF.getText());

    }
    

    @FXML
    private void signOutAdmin(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/scenes/Start.fxml"));
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

    @FXML
    private void signOutHoverEnter(MouseEvent event) {
        Image icon = new Image("/images/signout-icon-hover.png");
        signoutImg.setImage(icon); 
    }

    @FXML
    private void signOutHoverExit(MouseEvent event) {
        Image icon = new Image("/images/signout-icon.png");
        signoutImg.setImage(icon);      
    }


    
}
