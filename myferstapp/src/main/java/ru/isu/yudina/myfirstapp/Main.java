package ru.isu.yudina.myfirstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("АААААААААА");
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


}
