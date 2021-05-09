/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlpcidatabase.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tlpcidatabase.newGroup;

/**
 * FXML Controller class
 *
 * @author Elorm
 */
public class Tlpcidatabase_MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button closeButton;

    @FXML
    private Button minButton;

    @FXML
    private Button resizeButton;

    @FXML
    private TextField searchField;

    @FXML
    private Button newGroupButton;

    double xOffset = 0.0;
    double yOffset = 0.0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("TLPCIDataBasePU");
         
         EntityManager em = emf.createEntityManager();
              
              

    }

    @FXML
    void newGroup_ButtonEntered(MouseEvent event) {

        newGroupButton.setEffect(new Glow(0.5));

    }

    @FXML
    void newGroup_ButtonExited(MouseEvent event) {

        newGroupButton.setEffect(new Glow(0.0));
    }

    @FXML
    void newGroup_ButtonInitialized(ActionEvent event) throws Exception {
        newGroupButton.setEffect(new Glow(0.9));
        newGroup ng =  new newGroup();
        ng.start(new Stage());
    }

    @FXML
    void mainPanePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    void mainPaneDragged(MouseEvent event) {

        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.getScene().getWindow().setX(event.getScreenX() - xOffset);
        stage.getScene().getWindow().setY(event.getScreenY() - yOffset);
    }

    @FXML
    void searchFieldEntered(MouseEvent event) {
        searchField.setOpacity(1.0);
    }

    @FXML
    void searchFieldEXited(MouseEvent event) {
        searchField.setOpacity(0.5);
    }

    @FXML
    void searchFieldInitialized(ActionEvent event) {

    }

    @FXML
    void closeButtonEntered(MouseEvent event) {

        closeButton.setOpacity(1.0);
    }

    @FXML
    void closeButtonExited(MouseEvent event) {
        closeButton.setOpacity(0.5);

    }

    @FXML
    void closeButtonInitialized(ActionEvent event) {

        System.exit(1);
    }

    @FXML
    void resizeButtonEntered(MouseEvent event) {
        resizeButton.setOpacity(1.0);
    }

    @FXML
    void resizeButtonExited(MouseEvent event) {
        resizeButton.setOpacity(0.5);

    }

    @FXML
    void resizeButtonInitialized(ActionEvent event) {

    }

    @FXML
    void minButtonEntered(MouseEvent event) {

        minButton.setOpacity(1.0);
    }

    @FXML
    void minButtonExited(MouseEvent event) {
        minButton.setOpacity(0.5);

    }

    @FXML
    void minButtonInitialized(ActionEvent event) {

    }

}
