package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class WindowTwoController {

    @FXML
    private Button registerNewButton;

    public void clickRegister(ActionEvent actionEvent) throws IOException {
        Stage stage1;
        Parent root;
        stage1 = (Stage) registerNewButton.getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("resources/WindowOne.fxml")));
        Scene scene1 = new Scene(root, 1024,450);
        stage1.setScene(scene1);
        stage1.show();
    }
}
