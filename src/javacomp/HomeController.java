
package javacomp;

import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class HomeController implements Initializable {

    @FXML
    private AnchorPane bgPane;
    @FXML
    private ImageView posterIcon1;
    @FXML
    private ImageView posterIcon2;
    @FXML
    private ImageView posterIcon3;
    @FXML
    private ImageView posterIcon4;

    PreparedStatement ps;
    ResultSet rs;
    ArrayList <String> movieList = new ArrayList();//all movie title array
    String mname = ""; // movielist elements identifier
    Image img;
    Blob blob; 
    InputStream in;
    
    @FXML
    private Button movieb1;
    @FXML
    private Button movieb2;
    @FXML
    private Button movieb3;
    @FXML
    private Button movieb4;
    
    Button movieB[];

    private Label label;
    private ImageView seatImg;
    
    ToggleButton s[];
    ImageView ic[];
    
    @FXML
    private ToggleButton seatTb1;
    @FXML
    private ToggleButton seatTb2;
    @FXML
    private ToggleButton seatTb3;
    @FXML
    private ToggleButton seatTb4;
    @FXML
    private ToggleButton seatTb5;
    @FXML
    private ToggleButton seatTb6;      

    @FXML
    private ImageView seatIcon1;
    @FXML
    private ImageView seatIcon2;
    @FXML
    private ImageView seatIcon3;
    @FXML
    private ImageView seatIcon4;
    @FXML
    private ImageView seatIcon5;   
    @FXML
    private ImageView seatIcon6;
    @FXML
    private ImageView seatIcon7;
    @FXML
    private ToggleButton seatTb7;
    @FXML
    private ImageView seatIcon8;
    @FXML
    private ToggleButton seatTb8;
    @FXML
    private ImageView seatIcon9;
    @FXML
    private ToggleButton seatTb9;
    @FXML
    private ToggleButton seatTb11;
    @FXML
    private ImageView seatIcon11;
    @FXML
    private ImageView seatIcon12;
    @FXML
    private ToggleButton seatTb12;
    @FXML
    private ImageView seatIcon13;
    @FXML
    private ToggleButton seatTb13;
    @FXML
    private ImageView seatIcon14;
    @FXML
    private ToggleButton seatTb14;
    @FXML
    private ImageView seatIcon15;
    @FXML
    private ToggleButton seatTb15;
    @FXML
    private ImageView seatIcon16;
    @FXML
    private ToggleButton seatTb16;
    @FXML
    private ImageView seatIcon17;
    @FXML
    private ToggleButton seatTb17;
    @FXML
    private ImageView seatIcon18;
    @FXML
    private ToggleButton seatTb18;
    @FXML
    private ImageView seatIcon19;
    @FXML
    private ToggleButton seatTb19;
    @FXML
    private ImageView seatIcon20;
    @FXML
    private ToggleButton seatTb20;
    @FXML
    private ImageView seatIcon21;
    @FXML
    private ToggleButton seatTb21;
    @FXML
    private ImageView seatIcon22;
    @FXML
    private ToggleButton seatTb22;
    @FXML
    private ImageView seatIcon23;
    @FXML
    private ToggleButton seatTb23;
    @FXML
    private ImageView seatIcon24;
    @FXML
    private ToggleButton seatTb24;
    @FXML
    private ImageView seatIcon25;
    @FXML
    private ToggleButton seatTb25;
    @FXML
    private ImageView seatIcon26;
    @FXML
    private ToggleButton seatTb26;
    @FXML
    private ImageView seatIcon27;
    @FXML
    private ToggleButton seatTb27;
    @FXML
    private ImageView seatIcon28;
    @FXML
    private ToggleButton seatTb28;
    @FXML
    private ImageView seatIcon29;
    @FXML
    private ToggleButton seatTb29;
    @FXML
    private ImageView seatIcon30;
    @FXML
    private ToggleButton seatTb30;
    @FXML
    private ImageView seatIcon31;
    @FXML
    private ToggleButton seatTb31;
    @FXML
    private ImageView seatIcon32;
    @FXML
    private ToggleButton seatTb32;
    @FXML
    private ImageView seatIcon33;
    @FXML
    private ToggleButton seatTb33;
    @FXML
    private ImageView seatIcon34;
    @FXML
    private ToggleButton seatTb34;
    @FXML
    private ImageView seatIcon35;
    @FXML
    private ToggleButton seatTb35;
    @FXML
    private ImageView seatIcon36;
    @FXML
    private ToggleButton seatTb36;
    @FXML
    private ImageView seatIcon37;
    @FXML
    private ToggleButton seatTb37;
    @FXML
    private ImageView seatIcon38;
    @FXML
    private ToggleButton seatTb38;
    @FXML
    private ImageView seatIcon39;
    @FXML
    private ToggleButton seatTb39;
    @FXML
    private ImageView seatIcon40;
    @FXML
    private ToggleButton seatTb40;
    @FXML
    private ImageView seatIcon41;
    @FXML
    private ToggleButton seatTb41;
    @FXML
    private ImageView seatIcon42;
    @FXML
    private ToggleButton seatTb42;
    @FXML
    private ImageView seatIcon43;
    @FXML
    private ToggleButton seatTb43;
    @FXML
    private ImageView seatIcon44;
    @FXML
    private ToggleButton seatTb44;
    @FXML
    private ImageView seatIcon45;
    @FXML
    private ToggleButton seatTb45;
    @FXML
    private ImageView seatIcon46;
    @FXML
    private ToggleButton seatTb46;
    @FXML
    private ImageView seatIcon47;
    @FXML
    private ToggleButton seatTb47;
    @FXML
    private ImageView seatIcon48;
    @FXML
    private ToggleButton seatTb48;
    @FXML
    private ImageView seatIcon49;
    @FXML
    private ToggleButton seatTb49;
    @FXML
    private ImageView seatIcon50;
    @FXML
    private ToggleButton seatTb50;
    @FXML
    private ImageView seatIcon51;
    @FXML
    private ToggleButton seatTb51;
    @FXML
    private ImageView seatIcon52;
    @FXML
    private ToggleButton seatTb52;
    @FXML
    private ImageView seatIcon53;
    @FXML
    private ToggleButton seatTb53;
    @FXML
    private ImageView seatIcon54;
    @FXML
    private ToggleButton seatTb54;
    @FXML
    private ImageView seatIcon55;
    @FXML
    private ToggleButton seatTb55;
    @FXML
    private ImageView seatIcon56;
    @FXML
    private ToggleButton seatTb56;
    @FXML
    private ImageView seatIcon57;
    @FXML
    private ToggleButton seatTb57;
    @FXML
    private ImageView seatIcon58;
    @FXML
    private ToggleButton seatTb58;
    @FXML
    private ImageView seatIcon59;
    @FXML
    private ToggleButton seatTb59;
    @FXML
    private ImageView seatIcon60;
    @FXML
    private ToggleButton seatTb60;
    @FXML
    private ImageView seatIcon61;
    @FXML
    private ToggleButton seatTb61;
    @FXML
    private ImageView seatIcon62;
    @FXML
    private ToggleButton seatTb62;
    @FXML
    private ImageView seatIcon63;
    @FXML
    private ToggleButton seatTb63;
    @FXML
    private ImageView seatIcon64;
    @FXML
    private ToggleButton seatTb64;
    @FXML
    private ImageView seatIcon65;
    @FXML
    private ToggleButton seatTb65;
    @FXML
    private ImageView seatIcon66;
    @FXML
    private ToggleButton seatTb66;
    @FXML
    private ImageView seatIcon67;
    @FXML
    private ToggleButton seatTb67;
    @FXML
    private ImageView seatIcon68;
    @FXML
    private ToggleButton seatTb68;
    @FXML
    private ImageView seatIcon69;
    @FXML
    private ToggleButton seatTb69;
    @FXML
    private ImageView seatIcon70;
    @FXML
    private ToggleButton seatTb70;
    @FXML
    private ImageView seatIcon71;
    @FXML
    private ToggleButton seatTb71;
    @FXML
    private ImageView seatIcon72;
    @FXML
    private ToggleButton seatTb72;
    @FXML
    private ImageView seatIcon73;
    @FXML
    private ToggleButton seatTb73;
    @FXML
    private ImageView seatIcon74;
    @FXML
    private ToggleButton seatTb74;
    @FXML
    private ImageView seatIcon75;
    @FXML
    private ToggleButton seatTb75;
    @FXML
    private ImageView seatIcon76;
    @FXML
    private ToggleButton seatTb76;
    @FXML
    private ImageView seatIcon77;
    @FXML
    private ToggleButton seatTb77;
    @FXML
    private ImageView seatIcon78;
    @FXML
    private ToggleButton seatTb78;
    @FXML
    private ImageView seatIcon79;
    @FXML
    private ToggleButton seatTb79;
    @FXML
    private ImageView seatIcon80;
    @FXML
    private ToggleButton seatTb80;
    @FXML
    private ImageView seatIcon81;
    @FXML
    private ToggleButton seatTb81;
    @FXML
    private ImageView seatIcon82;
    @FXML
    private ToggleButton seatTb82;
    @FXML
    private ImageView seatIcon83;
    @FXML
    private ToggleButton seatTb83;
    @FXML
    private ImageView seatIcon84;
    @FXML
    private ToggleButton seatTb84;
    @FXML
    private ImageView seatIcon85;
    @FXML
    private ToggleButton seatTb85;
    @FXML
    private ImageView seatIcon86;
    @FXML
    private ToggleButton seatTb86;
    @FXML
    private ImageView seatIcon87;
    @FXML
    private ToggleButton seatTb87;
    @FXML
    private ImageView seatIcon88;
    @FXML
    private ToggleButton seatTb88;
    @FXML
    private ImageView seatIcon89;
    @FXML
    private ToggleButton seatTb89;
    @FXML
    private ImageView seatIcon90;
    @FXML
    private ToggleButton seatTb90;
    @FXML
    private ImageView seatIcon91;
    @FXML
    private ToggleButton seatTb91;
    @FXML
    private ImageView seatIcon92;
    @FXML
    private ToggleButton seatTb92;
    @FXML
    private ImageView seatIcon93;
    @FXML
    private ToggleButton seatTb93;
    @FXML
    private ImageView seatIcon94;
    @FXML
    private ToggleButton seatTb94;
    @FXML
    private ImageView seatIcon95;
    @FXML
    private ToggleButton seatTb95;
    @FXML
    private ImageView seatIcon96;
    @FXML
    private ToggleButton seatTb96;
    @FXML
    private ImageView seatIcon97;
    @FXML
    private ToggleButton seatTb97;
    @FXML
    private ImageView seatIcon98;
    @FXML
    private ToggleButton seatTb98;
    @FXML
    private ImageView seatIcon99;
    @FXML
    private ToggleButton seatTb99;
    @FXML
    private ImageView seatIcon100;
    @FXML
    private ToggleButton seatTb100;
    @FXML
    private ToggleButton seatTb101;
    @FXML
    private ImageView seatIcon102;
    @FXML
    private ToggleButton seatTb102;
    @FXML
    private ImageView seatIcon103;
    @FXML
    private ToggleButton seatTb103;
    @FXML
    private ImageView seatIcon104;
    @FXML
    private ToggleButton seatTb104;
    @FXML
    private ImageView seatIcon105;
    @FXML
    private ToggleButton seatTb105;
    @FXML
    private ImageView seatIcon106;
    @FXML
    private ToggleButton seatTb106;
    @FXML
    private ImageView seatIcon107;
    @FXML
    private ToggleButton seatTb107;
    @FXML
    private ImageView seatIcon108;
    @FXML
    private ToggleButton seatTb108;
    @FXML
    private ImageView seatIcon109;
    @FXML
    private ToggleButton seatTb109;
    @FXML
    private ImageView seatIcon110;
    @FXML
    private ToggleButton seatTb110;
    @FXML
    private ImageView seatIcon111;
    @FXML
    private ToggleButton seatTb111;
    @FXML
    private ImageView seatIcon112;
    @FXML
    private ToggleButton seatTb112;
    @FXML
    private ImageView seatIcon113;
    @FXML
    private ToggleButton seatTb113;
    @FXML
    private ImageView seatIcon114;
    @FXML
    private ToggleButton seatTb114;
    @FXML
    private ImageView seatIcon115;
    @FXML
    private ToggleButton seatTb115;
    @FXML
    private ImageView seatIcon116;
    @FXML
    private ToggleButton seatTb116;
    @FXML
    private ImageView seatIcon117;
    @FXML
    private ToggleButton seatTb117;
    @FXML
    private ImageView seatIcon118;
    @FXML
    private ToggleButton seatTb118;
    @FXML
    private ImageView seatIcon119;
    @FXML
    private ToggleButton seatTb119;
    @FXML
    private ImageView seatIcon120;
    @FXML
    private ToggleButton seatTb120;
    @FXML
    private ImageView seatIcon121;
    @FXML
    private ToggleButton seatTb121;
    @FXML
    private ImageView seatIcon122;
    @FXML
    private ToggleButton seatTb122;
    @FXML
    private ImageView seatIcon123;
    @FXML
    private ToggleButton seatTb123;
    @FXML
    private ImageView seatIcon124;
    @FXML
    private ToggleButton seatTb124;
    @FXML
    private ImageView seatIcon125;
    @FXML
    private ToggleButton seatTb125;
    @FXML
    private ImageView seatIcon126;
    @FXML
    private ToggleButton seatTb126;
    @FXML
    private ImageView seatIcon127;
    @FXML
    private ToggleButton seatTb127;
    @FXML
    private ImageView seatIcon128;
    @FXML
    private ToggleButton seatTb128;
    @FXML
    private ImageView seatIcon129;
    @FXML
    private ToggleButton seatTb129;
    @FXML
    private ImageView seatIcon130;
    @FXML
    private ToggleButton seatTb130;
    @FXML
    private ImageView seatIcon131;
    @FXML
    private ToggleButton seatTb131;
    @FXML
    private ImageView seatIcon132;
    @FXML
    private ToggleButton seatTb132;
    @FXML
    private ImageView seatIcon133;
    @FXML
    private ToggleButton seatTb133;
    @FXML
    private ImageView seatIcon134;
    @FXML
    private ToggleButton seatTb134;
    @FXML
    private ImageView seatIcon135;
    @FXML
    private ToggleButton seatTb135;
    @FXML
    private ImageView seatIcon136;
    @FXML
    private ToggleButton seatTb136;
    @FXML
    private ImageView seatIcon137;
    @FXML
    private ToggleButton seatTb137;
    @FXML
    private ImageView seatIcon138;
    @FXML
    private ToggleButton seatTb138;
    @FXML
    private ImageView seatIcon139;
    @FXML
    private ToggleButton seatTb139;
    @FXML
    private ImageView seatIcon140;
    @FXML
    private ToggleButton seatTb140;
    @FXML
    private ImageView seatIcon141;
    @FXML
    private ToggleButton seatTb141;
    @FXML
    private ImageView seatIcon142;
    @FXML
    private ToggleButton seatTb142;
    @FXML
    private ImageView seatIcon143;
    @FXML
    private ToggleButton seatTb143;
    @FXML
    private ImageView seatIcon144;
    @FXML
    private ToggleButton seatTb144;
    @FXML
    private ImageView seatIcon145;
    @FXML
    private ToggleButton seatTb145;
    @FXML
    private ImageView seatIcon146;
    @FXML
    private ToggleButton seatTb146;
    @FXML
    private ImageView seatIcon147;
    @FXML
    private ToggleButton seatTb147;
    @FXML
    private ImageView seatIcon148;
    @FXML
    private ToggleButton seatTb148;
    @FXML
    private ImageView seatIcon149;
    @FXML
    private ToggleButton seatTb149;
    @FXML
    private ImageView seatIcon150;
    @FXML
    private ToggleButton seatTb150;
    @FXML
    private ImageView seatIcon151;
    @FXML
    private ToggleButton seatTb151;
    @FXML
    private ImageView seatIcon152;
    @FXML
    private ToggleButton seatTb152;
    @FXML
    private ImageView seatIcon153;
    @FXML
    private ToggleButton seatTb153;
    @FXML
    private ImageView seatIcon154;
    @FXML
    private ToggleButton seatTb154;
    @FXML
    private ImageView seatIcon155;
    @FXML
    private ToggleButton seatTb155;
    @FXML
    private ImageView seatIcon156;
    @FXML
    private ToggleButton seatTb156;
    @FXML
    private ImageView seatIcon157;
    @FXML
    private ToggleButton seatTb157;
    @FXML
    private ImageView seatIcon158;
    @FXML
    private ToggleButton seatTb158;
    @FXML
    private ImageView seatIcon159;
    @FXML
    private ToggleButton seatTb159;
    @FXML
    private ImageView seatIcon160;
    @FXML
    private ToggleButton seatTb160;
    @FXML
    private ImageView seatIcon161;
    @FXML
    private ToggleButton seatTb161;
    @FXML
    private ImageView seatIcon162;
    @FXML
    private ToggleButton seatTb162;
    @FXML
    private ImageView seatIcon163;
    @FXML
    private ToggleButton seatTb163;
    @FXML
    private ImageView seatIcon164;
    @FXML
    private ToggleButton seatTb164;
    @FXML
    private ImageView seatIcon10;
    @FXML
    private ToggleButton seatTb10;
    @FXML
    private ImageView seatIcon101;
    
    
    @FXML
    private ImageView prevB;
    @FXML
    private ImageView nextB;
    @FXML
    private Pane moviePane;
    @FXML
    private Pane donePane;
    @FXML
    private Pane timePane;
    @FXML
    private Label moviePB;
    @FXML
    private Label timePB;
    @FXML
    private Label snackPB;
    @FXML
    private Label confirmationPB;
    @FXML
    private Label donePB;
    @FXML
    private Spinner<Integer> getTicketqty;
    
    ToggleButton sbButton[];
    ImageView sbImg[];
    
    @FXML
    private ImageView kc1img;
    @FXML
    private ToggleButton kc1B;
    @FXML
    private ImageView kc2img;
    @FXML
    private ToggleButton kc2B;
    @FXML
    private ImageView kc3img;
    @FXML
    private ToggleButton kc3B;
    @FXML
    private ImageView kc4img;
    @FXML
    private ToggleButton kc4B;
    
    ToggleButton sbSoloButton[];
    ImageView sbSoloImg[];    
    
    @FXML
    private ImageView sbSoloImg1;
    @FXML
    private ToggleButton sbSoloB1;
    @FXML
    private ImageView sbSoloImg2;
    @FXML
    private ToggleButton sbSoloB2;
    @FXML
    private ImageView sbSoloImg3;
    @FXML
    private ToggleButton sbSoloB3;
    @FXML
    private ImageView sbSoloImg4;
    @FXML
    private ToggleButton sbSoloB4;
    @FXML
    private ImageView sbSoloImg5;
    @FXML
    private ToggleButton sbSoloB5;
    @FXML
    private ImageView sbSoloImg6;
    @FXML
    private ToggleButton sbSoloB6;
    @FXML
    private Pane snackbarpane;
    @FXML
    private ImageView prevB1;
    @FXML
    private ImageView nextB1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        sbButton = new ToggleButton[4];
        sbButton[0] = kc1B;
        sbButton[1] = kc2B;
        sbButton[2] = kc3B;
        sbButton[3] = kc4B;
        
        sbImg = new ImageView[4];
        sbImg[0] = kc1img;
        sbImg[1] = kc2img;
        sbImg[2] = kc3img;
        sbImg[3] = kc4img;
        
        sbSoloButton = new ToggleButton[6];
        sbSoloButton[0] = sbSoloB1;
        sbSoloButton[1] = sbSoloB2;
        sbSoloButton[2] = sbSoloB3;
        sbSoloButton[3] = sbSoloB4;
        sbSoloButton[4] = sbSoloB5;
        sbSoloButton[5] = sbSoloB6;
        
        sbSoloImg = new ImageView[6]; 
        sbSoloImg[0] = sbSoloImg1;
        sbSoloImg[1] = sbSoloImg2;
        sbSoloImg[2] = sbSoloImg3;
        sbSoloImg[3] = sbSoloImg4;
        sbSoloImg[4] = sbSoloImg5;
        sbSoloImg[5] = sbSoloImg6;
        
        moviePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;");
        s = new ToggleButton[164];
        s[0] = seatTb1; s[1] = seatTb2; s[2] = seatTb3; s[3] = seatTb4; s[4] = seatTb5; s[5] = seatTb6;
        s[6] = seatTb7; s[7] = seatTb8; s[8] = seatTb9; s[9] = seatTb10; s[10] = seatTb11; s[11] = seatTb12;
        s[12] = seatTb13; s[13] = seatTb14; s[14] = seatTb15; s[15] = seatTb16; s[16] = seatTb17; s[17] = seatTb18;
        s[18] = seatTb19; s[19] = seatTb20; s[20] = seatTb21; s[21] = seatTb22; s[22] = seatTb23; s[23] = seatTb24;
        s[24] = seatTb25; s[25] = seatTb26; s[26] = seatTb27; s[27] = seatTb28; s[28] = seatTb29; s[29] = seatTb30;
        s[30] = seatTb31; s[31] = seatTb32; s[32] = seatTb33; s[33] = seatTb34; s[34] = seatTb35; s[35] = seatTb36;
        s[36] = seatTb37; s[37] = seatTb38; s[38] = seatTb39; s[39] = seatTb40; s[40] = seatTb41; s[41] = seatTb42;
        s[42] = seatTb43; s[43] = seatTb44; s[44] = seatTb45; s[45] = seatTb46; s[46] = seatTb47; s[47] = seatTb48;
        s[48] = seatTb49; s[49] = seatTb50; s[50] = seatTb51; s[51] = seatTb52; s[52] = seatTb53; s[53] = seatTb54;
        s[54] = seatTb55; s[55] = seatTb56; s[56] = seatTb57; s[57] = seatTb58; s[58] = seatTb59; s[59] = seatTb60;
        s[60] = seatTb61; s[61] = seatTb62; s[62] = seatTb63; s[63] = seatTb64; s[64] = seatTb65; s[65] = seatTb66;
        s[66] = seatTb67; s[67] = seatTb68; s[68] = seatTb69; s[69] = seatTb70; s[70] = seatTb71; s[71] = seatTb72;
        s[72] = seatTb73; s[73] = seatTb74; s[74] = seatTb75; s[75] = seatTb76; s[76] = seatTb77; s[77] = seatTb78;
        s[78] = seatTb79; s[79] = seatTb80; s[80] = seatTb81; s[81] = seatTb82; s[82] = seatTb83; s[83] = seatTb84;
        s[84] = seatTb85; s[85] = seatTb86; s[86] = seatTb87; s[87] = seatTb88; s[88] = seatTb89; s[89] = seatTb90;
        s[90] = seatTb91; s[91] = seatTb92; s[92] = seatTb93; s[93] = seatTb94; s[94] = seatTb95; s[95] = seatTb96;
        s[96] = seatTb97; s[97] = seatTb98; s[98] = seatTb99; s[99] = seatTb100; s[100] = seatTb101; s[101] = seatTb102;
        s[102] = seatTb103; s[103] = seatTb104; s[104] = seatTb105; s[105] = seatTb106; s[106] = seatTb107; s[107] = seatTb108;
        s[108] = seatTb109; s[109] = seatTb110; s[110] = seatTb111; s[111] = seatTb112; s[112] = seatTb113; s[113] = seatTb114;
        s[114] = seatTb115; s[115] = seatTb116; s[116] = seatTb117; s[117] = seatTb118; s[118] = seatTb119; s[119] = seatTb120;
        s[120] = seatTb121; s[121] = seatTb122; s[122] = seatTb123; s[123] = seatTb124; s[124] = seatTb125; s[125] = seatTb126;
        s[126] = seatTb127; s[127] = seatTb128; s[128] = seatTb129; s[129] = seatTb130; s[130] = seatTb131; s[131] = seatTb132;
        s[132] = seatTb133; s[133] = seatTb134; s[134] = seatTb135; s[135] = seatTb136; s[136] = seatTb137; s[137] = seatTb138;
        s[138] = seatTb139; s[139] = seatTb140; s[140] = seatTb141; s[141] = seatTb142; s[142] = seatTb143; s[143] = seatTb144;
        s[144] = seatTb145; s[145] = seatTb146; s[146] = seatTb147; s[147] = seatTb148; s[148] = seatTb149; s[149] = seatTb150;
        s[150] = seatTb151; s[151] = seatTb152; s[152] = seatTb153; s[153] = seatTb154; s[154] = seatTb155; s[155] = seatTb156;
        s[156] = seatTb157; s[157] = seatTb158; s[158] = seatTb159; s[159] = seatTb160; s[160] = seatTb161; s[161] = seatTb162;
        s[162] = seatTb163; s[163] = seatTb164;

        ic = new ImageView[164];
        ic[0] = seatIcon1; ic[1] = seatIcon2; ic[2] = seatIcon3; ic[3] = seatIcon4; ic[4] = seatIcon5; ic[5] = seatIcon6;
        ic[6] = seatIcon7; ic[7] = seatIcon8; ic[8] = seatIcon9; ic[9] = seatIcon10; ic[10] = seatIcon11; ic[11] = seatIcon12;
        ic[12] = seatIcon13; ic[13] = seatIcon14; ic[14] = seatIcon15; ic[15] = seatIcon16; ic[16] = seatIcon17; ic[17] = seatIcon18;
        ic[18] = seatIcon19; ic[19] = seatIcon20; ic[20] = seatIcon21; ic[21] = seatIcon22; ic[22] = seatIcon23; ic[23] = seatIcon24;
        ic[24] = seatIcon25; ic[25] = seatIcon26; ic[26] = seatIcon27; ic[27] = seatIcon28; ic[28] = seatIcon29; ic[29] = seatIcon30;
        ic[30] = seatIcon31; ic[31] = seatIcon32; ic[32] = seatIcon33; ic[33] = seatIcon34; ic[34] = seatIcon35; ic[35] = seatIcon36;
        ic[36] = seatIcon37; ic[37] = seatIcon38; ic[38] = seatIcon39; ic[39] = seatIcon40; ic[40] = seatIcon41; ic[41] = seatIcon42;
        ic[42] = seatIcon43; ic[43] = seatIcon44; ic[44] = seatIcon45; ic[45] = seatIcon46; ic[46] = seatIcon47; ic[47] = seatIcon48;
        ic[48] = seatIcon49; ic[49] = seatIcon50; ic[50] = seatIcon51; ic[51] = seatIcon52; ic[52] = seatIcon53; ic[53] = seatIcon54;
        ic[54] = seatIcon55; ic[55] = seatIcon56; ic[56] = seatIcon57; ic[57] = seatIcon58; ic[58] = seatIcon59; ic[59] = seatIcon60;
        ic[60] = seatIcon61; ic[61] = seatIcon62; ic[62] = seatIcon63; ic[63] = seatIcon64; ic[64] = seatIcon65; ic[65] = seatIcon66;
        ic[66] = seatIcon67; ic[67] = seatIcon68; ic[68] = seatIcon69; ic[69] = seatIcon70; ic[70] = seatIcon71; ic[71] = seatIcon72;
        ic[72] = seatIcon73; ic[73] = seatIcon74; ic[74] = seatIcon75; ic[75] = seatIcon76; ic[76] = seatIcon77; ic[77] = seatIcon78;
        ic[78] = seatIcon79; ic[79] = seatIcon80; ic[80] = seatIcon81; ic[81] = seatIcon82; ic[82] = seatIcon83; ic[83] = seatIcon84;
        ic[84] = seatIcon85; ic[85] = seatIcon86; ic[86] = seatIcon87; ic[87] = seatIcon88; ic[88] = seatIcon89; ic[89] = seatIcon90;
        ic[90] = seatIcon91; ic[91] = seatIcon92; ic[92] = seatIcon93; ic[93] = seatIcon94; ic[94] = seatIcon95; ic[95] = seatIcon96;
        ic[96] = seatIcon97; ic[97] = seatIcon98; ic[98] = seatIcon99; ic[99] = seatIcon100; ic[100] = seatIcon101; ic[101] = seatIcon102;
        ic[102] = seatIcon103; ic[103] = seatIcon104; ic[104] = seatIcon105; ic[105] = seatIcon106; ic[106] = seatIcon107; ic[107] = seatIcon108;
        ic[108] = seatIcon109; ic[109] = seatIcon110; ic[110] = seatIcon111; ic[111] = seatIcon112; ic[112] = seatIcon113; ic[113] = seatIcon114;
        ic[114] = seatIcon115; ic[115] = seatIcon116; ic[116] = seatIcon117; ic[117] = seatIcon118; ic[118] = seatIcon119; ic[119] = seatIcon120;
        ic[120] = seatIcon121; ic[121] = seatIcon122; ic[122] = seatIcon123; ic[123] = seatIcon124; ic[124] = seatIcon125; ic[125] = seatIcon126;
        ic[126] = seatIcon127; ic[127] = seatIcon128; ic[128] = seatIcon129; ic[129] = seatIcon130; ic[130] = seatIcon131; ic[131] = seatIcon132;
        ic[132] = seatIcon133; ic[133] = seatIcon134; ic[134] = seatIcon135; ic[135] = seatIcon136; ic[136] = seatIcon137; ic[137] = seatIcon138;
        ic[138] = seatIcon139; ic[139] = seatIcon140; ic[140] = seatIcon141; ic[141] = seatIcon142; ic[142] = seatIcon143; ic[143] = seatIcon144;
        ic[144] = seatIcon145; ic[145] = seatIcon146; ic[146] = seatIcon147; ic[147] = seatIcon148; ic[148] = seatIcon149; ic[149] = seatIcon150;
        ic[150] = seatIcon151; ic[151] = seatIcon152; ic[152] = seatIcon153; ic[153] = seatIcon154; ic[154] = seatIcon155; ic[155] = seatIcon156;
        ic[156] = seatIcon157; ic[157] = seatIcon158; ic[158] = seatIcon159; ic[159] = seatIcon160; ic[160] = seatIcon161; ic[161] = seatIcon162;
        ic[162] = seatIcon163; ic[163] = seatIcon164;
        
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 164);
        valueFactory.setValue(1);
	getTicketqty.setValueFactory(valueFactory);
        
        
    }
    
    void allMovieTitleToArray(){  
        try {
            ps = Database.connect().prepareStatement("SELECT * FROM `movielist`");
            rs = ps.executeQuery();
                while(rs.next()){
                 movieList.add(rs.getString("Movie Title"));  
                }
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }

    void displayMoviePosters(){
        allMovieTitleToArray();
        
        for(int i = 0 ; i < movieList.size(); i++){
            mname = movieList.get(i);
            try {
                ps = Database.connect().prepareStatement("SELECT `image` FROM `movielist` WHERE `Movie Title`=?");
                ps.setString(1, mname);
                rs = ps.executeQuery();
                while(rs.next()){
                    if(i == 0){
                            blob = rs.getBlob(1);
                            in = blob.getBinaryStream(); 
                            img = new Image(in);
                            posterIcon1 = new ImageView(img);  
                        }
                    else if ( i == 1){
                            blob = rs.getBlob(1);
                            in = blob.getBinaryStream(); 
                            img = new Image(in);
                            posterIcon2 = new ImageView(img);                        
                        }
                    else if (i ==2){
                            blob = rs.getBlob(1);
                            in = blob.getBinaryStream(); 
                            img = new Image(in);
                            posterIcon3 = new ImageView(img);
                        }
                    else if( i == 3){
                            blob = rs.getBlob(1);
                            in = blob.getBinaryStream(); 
                            img = new Image(in);
                            posterIcon4 = new ImageView(img);
                        }
                }               
            } catch (SQLException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }
    
    void setMovie(String mn){
        this.mname = mn;
        
    }
    @FXML
    private void selectMovieb(MouseEvent event) {
        allMovieTitleToArray();
        movieB =  new Button[4];
        movieB[0] = movieb1; movieB[1] = movieb2;
        movieB[2] = movieb3; movieB[3] = movieb4;
        for(int i = 0; i < movieB.length; i++){
           if(movieB[i].isPressed()){
               mname = movieList.get(i);
               setMovie(mname);
            }
                
        }
        // naa ang methods sa seats na controller
        //displayTimeSlot(); 
        //displaySelectMoviePanel();        
    }

    @FXML
    private void mouseHoverExit(MouseEvent event) {
         for(int x = 0; x < s.length; x++){
            if(!s[x].isSelected()){
                Image icon = new Image("/images/chair1.png");
                ic[x].setImage(icon); 
            }          
        }       
    }

    @FXML
    private void mouseHoverEntered(MouseEvent event) {
        for(int x = 0; x < s.length; x++){
            if(!s[x].isSelected()&& s[x].isHover()){
                Image icon = new Image("/images/chairw.png");
                ic[x].setImage(icon); 
            }           
        }       
    }

    @FXML
    private void selectSeat(ActionEvent event) {
        for(int x = 0; x < s.length; x++){
            if(s[x].isSelected()){
                //System.out.println("select seat" + (x+1));
                Image icon = new Image("/keashdraft/chairw.png");
                ic[x].setImage(icon); 
            }
            else if(!s[x].isSelected()){
                Image icon = new Image("/keashdraft/chair1.png");
                ic[x].setImage(icon); 
            }            
        }       
    }

    @FXML
    private void prevBMouseExited(MouseEvent event) {
        Image icon = new Image("/images/back.png");
        prevB.setImage(icon);
    }

    @FXML
    private void prevBMouseEntered(MouseEvent event) {
        Image icon = new Image("/images/back-hover.png");
        prevB.setImage(icon);        
    }

    @FXML
    private void nextBMouseExited(MouseEvent event) {
        Image icon = new Image("/images/next.png");
        nextB.setImage(icon);       
    }

    @FXML
    private void nextBMouseEntered(MouseEvent event) {
        Image icon = new Image("/images/next-hover.png");
        nextB.setImage(icon);
    }

    @FXML
    private void selectMovie(MouseEvent event) {
        timePane.toFront();
        moviePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #6E6E6D;");
        timePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void backToMovieSelect(MouseEvent event) {
        moviePane.toFront();
        timePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #6E6E6D;");
        moviePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;");        
    }

    private void proceedToSnackorConfirm(MouseEvent event) {
        donePane.toFront();
        timePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #6E6E6D;");
        donePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;");       
    }

    @FXML
    private void sbMouseHoverExit(MouseEvent event) {
        for(int i = 0; i < sbButton.length ; i++){
            if(!sbButton[i].isHover()){
                if(i == 0){
                    Image icon = new Image("/images/KC1.png");
                    sbImg[i].setImage(icon);
                }
                else if( i == 1){
                    Image icon = new Image("/images/KC2.png");
                    sbImg[i].setImage(icon);                 
                }
                else if(i == 2){
                    Image icon = new Image("/images/KC3.png");
                    sbImg[i].setImage(icon);                   
                }
                else if(i == 3){
                    Image icon = new Image("/images/KC4.png");
                    sbImg[i].setImage(icon);                       
                }
                
            }
                
            }
    }

    @FXML
    private void sbMouseHoverEntered(MouseEvent event) {
        for(int i = 0; i < sbButton.length ; i++){
            if(sbButton[i].isHover()){
                if(i == 0){
                    Image icon = new Image("/images/KC1-hover.png");
                    sbImg[i].setImage(icon);
                }
                else if( i == 1){
                    Image icon = new Image("/images/KC2-hover.png");
                    sbImg[i].setImage(icon);                 
                }
                else if(i == 2){
                    Image icon = new Image("/images/KC3-hover.png");
                    sbImg[i].setImage(icon);                   
                }
                else if(i == 3){
                    Image icon = new Image("/images/KC4-hover.png");
                    sbImg[i].setImage(icon);                    
                }
                
            }
                
            }       
    }

    @FXML
    private void sbSoloMouseHoverEntered(MouseEvent event) {
        for(int i = 0; i < sbSoloButton.length; i++){
            if(sbSoloButton[i].isHover()){
                if(i == 0){
                    Image icon = new Image("/images/soda-hover.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);                  
                }
                else if(i == 1){
                    Image icon = new Image("/images/iced-tea-hover.png");
                    sbSoloImg[i].setImage(icon); 
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);
                }
                else if (i == 2){
                    Image icon = new Image("/images/water-bottle-hover.png");
                    sbSoloImg[i].setImage(icon);  
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);                  
                }
                else if(i == 3){
                    Image icon = new Image("/images/popcorn-hover.png");
                    sbSoloImg[i].setImage(icon); 
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);
                }
                else if(i == 4){
                    Image icon = new Image("/images/chocolate-bar-hover.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);
                }
                else if(i == 5){
                    Image icon = new Image("/images/cupcake-hover.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(120);
                    sbSoloImg[i].setFitHeight(120);
                }
            }
        }
    }

    @FXML
    private void sbSoloMouseHoverExit(MouseEvent event) {
        for(int i = 0; i < sbSoloButton.length; i++){
            if(!sbSoloButton[i].isHover()){
                if(i == 0){
                    Image icon = new Image("/images/soda.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
                else if(i == 1){
                    Image icon = new Image("/images/iced-tea.png");
                    sbSoloImg[i].setImage(icon);  
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
                else if (i == 2){
                    Image icon = new Image("/images/water-bottle.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
                else if(i == 3){
                    Image icon = new Image("/images/popcorn.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
                else if(i == 4){
                    Image icon = new Image("/images/chocolate-bar.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
                else if(i == 5){
                    Image icon = new Image("/images/cupcake.png");
                    sbSoloImg[i].setImage(icon);
                    sbSoloImg[i].setFitWidth(100);
                    sbSoloImg[i].setFitHeight(100);
                }
            }
        }     
    }

    @FXML
    private void proceedToSnack(MouseEvent event) {
        snackbarpane.toFront();
        timePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #6E6E6D;");
        snackPB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;"); 
    }

    @FXML
    private void backToTimeSelect(MouseEvent event) {
                timePane.toFront();
        snackPB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #6E6E6D;");
        timePB.setStyle("-fx-font-family: 'Work Sans', sans-serif; -fx-font-size: 20; -fx-text-fill: #FFFFFF;");
    }

    @FXML
    private void proceedToConfirm(MouseEvent event) {
    }
    
}
