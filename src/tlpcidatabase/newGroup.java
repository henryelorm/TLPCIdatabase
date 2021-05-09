/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlpcidatabase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tlpcidatabase.Utility.Paths;

/**
 *
 * @author Elorm
 */
public class newGroup extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
      
        Parent root = FXMLLoader.load(newGroup.class.getResource(Paths.newGroup));
        
        Scene scene =  new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }
    
}
