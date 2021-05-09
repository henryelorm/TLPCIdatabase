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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tlpcidatabase.EntityManager.NewGroup;

/**
 * FXML Controller class
 *
 * @author Elorm
 */
public class NewGroupController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane pane;

    @FXML
    private Button cancel;

    @FXML
    public static Button finish;

    @FXML
    public static TextField newGroup_Field;

    double xOffset = 0.0;
    double yOffset = 0.0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void finishButton_Initialized(ActionEvent event) {

        NewGroup.newgroup("the_table_name");
        Stage primaryStage = (Stage) pane.getScene().getWindow();

        primaryStage.close();
    }

    @FXML
    void cancelButton_initialiazed(ActionEvent event) {
        Stage primaryStage = (Stage) pane.getScene().getWindow();

        primaryStage.close();
    }

    @FXML
    void panePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    void paneDragged(MouseEvent event) {

        Stage stage = (Stage) pane.getScene().getWindow();
        stage.getScene().getWindow().setX(event.getScreenX() - xOffset);
        stage.getScene().getWindow().setY(event.getScreenY() - yOffset);
    }

}
