package com.example.notebook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotebookApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                NotebookApp.class.getResource("/notebook/notebook-view.fxml")
        );

        Scene scene = new Scene(loader.load(), 600, 700);

        stage.setTitle("My Notebook");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
