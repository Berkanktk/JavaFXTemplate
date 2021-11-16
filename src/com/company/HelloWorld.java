package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

 // TODO: 1. Add JavaFX Library (File -> Project Structure -> Libraries -> Hit"+")
 // TODO: 2. Add VM Options (Run -> Edit Configurations -> Modify Options -> Add VM Options)
 // TODO: 3. Paste this: --module-path "PATH_TO_THE_LIB_FOLDER" --add-modules javafx.controls,javafx.fxml
 // TODO: 4. Hit Apply
 // TODO: 5. Add fxml files under the resources folder and create some controllers for each fxml file.

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("resources/WindowOne.fxml")));

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 1024, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}