import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    @Override
    public void start(Stage stage) {

        //creates the controller
        controller = new DictionaryController();

        //creates the interface components
        Label title = new Label("Virtual Dictionary");

        Label instruction = new Label("Enter a word to find its meaning:");

        TextField wordInput = new TextField();
        wordInput.setPromptText("Enter a word...");
        wordInput.setPrefWidth(250);

        Button searchButton = new Button("Search");

        TextArea meaningOutput = new TextArea();
        meaningOutput.setEditable(false);
        meaningOutput.setWrapText(true);
        meaningOutput.setPrefHeight(120);
        meaningOutput.setPrefWidth(300);
        meaningOutput.setPromptText("The meaning will appear here...");

        //handles the search button
        searchButton.setOnAction(event -> {

            String word = wordInput.getText();

            String result = controller.searchWord(word);

            meaningOutput.setText(result);
        });

        //allows pressing Enter to search
        wordInput.setOnAction(event -> searchButton.fire());

        //creates the layout
        FlowPane layout = new FlowPane();

        layout.setAlignment(Pos.CENTER);
        layout.setOrientation(javafx.geometry.Orientation.VERTICAL);
        layout.setVgap(15);
        layout.setHgap(10);
        layout.setPadding(new Insets(30));

        //adds components to the layout
        layout.getChildren().addAll(
                title,
                instruction,
                wordInput,
                searchButton,
                meaningOutput
        );

        //creates the scene
        Scene scene = new Scene(layout, 400, 350);

        //configures the window
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
