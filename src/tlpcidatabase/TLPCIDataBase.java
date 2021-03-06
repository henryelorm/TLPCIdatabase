package tlpcidatabase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tlpcidatabase.Utility.Paths;


public class TLPCIDataBase extends Application{

    @Override
    public void start(Stage stage) throws Exception {
     
        Parent root = FXMLLoader.load(TLPCIDataBase.class.getResource(Paths.mainInterface));
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}