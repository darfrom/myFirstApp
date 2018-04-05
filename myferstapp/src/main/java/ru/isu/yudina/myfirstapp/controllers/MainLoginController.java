package ru.isu.yudina.myfirstapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLoginController {

    public AnchorPane main_ap;

    private void close(){
        Stage s = (Stage) main_ap.getScene().getWindow();
        s.close();
    }




    @FXML
    void photographerLogin(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/photographer.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.show();
        close();
    }

    @FXML
    void photosLogin(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/photos.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.show();
        close();
    }


    @FXML
    void studioLogin(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().
                getResource("views/studio.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root));
        stage.show();
        close();
    }


}
