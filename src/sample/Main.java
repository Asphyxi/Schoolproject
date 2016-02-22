package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));
        primaryStage.setTitle( "Chamani Clicker" );
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // Start de timer.
       // new Thread(new Timer()).start(); // op een ander process draaid nu de timer, zodat je ui niet volloopt.





    }
}
