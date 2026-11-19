package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

public class CurrencyView {

    private TextField amountField;
    private TextField resultField;

    private ComboBox<Currency> fromCurrencyBox;
    private ComboBox<Currency> toCurrencyBox;

    private Button convertButton;

    private VBox layout;

    public CurrencyView() {

        //main layout
        layout = new VBox(15);
        layout.setPadding(new Insets(25));
        layout.setAlignment(Pos.CENTER);

        //title
        Label title = new Label("Currency Converter");
        title.setId("title");

        //instructions
        Label instructions = new Label(
                "Enter an amount, select currencies and click Convert."
        );

        //amount
        Label amountLabel = new Label("Amount to convert:");
        amountField = new TextField();
        amountField.setPromptText("Enter amount (e.g. 100)");

        //currency selection
        Label fromLabel = new Label("From currency:");
        fromCurrencyBox = new ComboBox<>();

        Label toLabel = new Label("To currency:");
        toCurrencyBox = new ComboBox<>();

        //result
        Label resultLabel = new Label("Converted amount:");
        resultField = new TextField();
        resultField.setEditable(false);
        resultField.setPromptText("Conversion result");

        //convert button
        convertButton = new Button("Convert");

        //currency selection layout
        HBox currencyLayout = new HBox(20);
        currencyLayout.setAlignment(Pos.CENTER);

        VBox fromLayout = new VBox(5, fromLabel, fromCurrencyBox);
        VBox toLayout = new VBox(5, toLabel, toCurrencyBox);

        currencyLayout.getChildren().addAll(fromLayout, toLayout);

        //adds everything to main layout
        layout.getChildren().addAll(
                title,
                instructions,
                amountLabel,
                amountField,
                currencyLayout,
                resultLabel,
                resultField,
                convertButton
        );
    }

    public Scene getScene() {
        return new Scene(layout, 450, 500);
    }

    public TextField getAmountField() {
        return amountField;
    }

    public TextField getResultField() {
        return resultField;
    }

    public ComboBox<Currency> getFromCurrencyBox() {
        return fromCurrencyBox;
    }

    public ComboBox<Currency> getToCurrencyBox() {
        return toCurrencyBox;
    }

    public Button getConvertButton() {
        return convertButton;
    }
}
