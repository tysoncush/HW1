package homework1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homework1.fxml"));
        primaryStage.setTitle("Homework 1");
        primaryStage.setScene(new Scene(root, 340, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}