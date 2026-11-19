package com.example;

import javafx.scene.control.Alert;

public class CurrencyController {

    private CurrencyModel model;
    private CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {

        this.model = model;
        this.view = view;

        //adds currencies
        view.getFromCurrencyBox().getItems().addAll(model.getCurrencies());
        view.getToCurrencyBox().getItems().addAll(model.getCurrencies());

        //sets default currencies
        view.getFromCurrencyBox().setValue(model.getCurrencies().get(0));
        view.getToCurrencyBox().setValue(model.getCurrencies().get(1));

        //handles convert button click
        view.getConvertButton().setOnAction(event -> convertCurrency());
    }

    private void convertCurrency() {

        try {
            //gets the amount entered by the user
            double amount = Double.parseDouble(
                    view.getAmountField().getText()
            );

            //checks that the amount is positive
            if (amount <= 0) {
                showError("Amount must be bigger than zero.");
                return;
            }

            //gets selected currencies
            Currency fromCurrency =
                    view.getFromCurrencyBox().getValue();

            Currency toCurrency =
                    view.getToCurrencyBox().getValue();

            //converts to USD, then to target currency
            double amountInUSD =
                    amount / fromCurrency.getRateToUSD();

            double convertedAmount =
                    amountInUSD * toCurrency.getRateToUSD();

            //show result
            view.getResultField().setText(
                    String.format("%.2f", convertedAmount)
            );

        } catch (NumberFormatException e) {

            showError("Please enter a valid number.");

        }
    }

    private void showError(String message) {

        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Input Error");
        alert.setHeaderText("Invalid Input");
        alert.setContentText(message);

        alert.showAndWait();
    }
}
