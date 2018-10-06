
package tomboluwe;
import  javafx.scene.control.Button;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author Anisa Isti
 */
public class FXMLLoginController implements Initializable {
    
    @FXML
    private JFXTextField InUser;
    @FXML
    private JFXPasswordField InPass;
    private Label tampilPass;
    private Label tampilUser;
    String username, password;
    @FXML
    private Label label;
    @FXML
    private JFXButton btnLogin;
    public String user="makan";
    public String pass="makan123";
    @FXML
    private void handleButtonAction(ActionEvent event) {
     
        
        username=InUser.getText();
        password=InPass.getText();
       // tampilUser.setText(username);
       // tampilPass.setText(password);
        
        if(username.equalsIgnoreCase(user) && password.equalsIgnoreCase(pass)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("TomboLuwe");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        
        
//        if(username.equalsIgnoreCase("tomboluwe") && password.equalsIgnoreCase("mangan")){
//          Parent Home = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
//          Scene homescene = new Scene(Home);
//          Stage on = (Stage)((Node)event.getSource()).getScene().getWindow();
//          on.setScene(homescene);
//            on.show();
//        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
