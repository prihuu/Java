package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class CurrencyConverterApp extends Application {

    @Override
    public void start(Stage stage) {

        //creates the model
        CurrencyModel model = new CurrencyModel();

        //creates the view
        CurrencyView view = new CurrencyView();

        //connects model and view through the controller
        CurrencyController controller =
                new CurrencyController(model, view);

        //the window
        stage.setTitle("Currency Converter");
        var scene = view.getScene();
        scene.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );
        stage.setScene(scene);
        stage.setResizable(false);

        //shows the application
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
