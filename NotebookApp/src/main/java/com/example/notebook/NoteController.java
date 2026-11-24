package com.example.notebook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private VBox notesContainer;

    private Notebook notebook = new Notebook();

    @FXML
    private void addNote() {

        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isEmpty() || content.isEmpty()) {
            return;
        }

        Note note = new Note(title, content);

        notebook.addNote(note);

        Label titleLabel = new Label(note.getTitle());
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Label contentLabel = new Label(note.getContent());
        contentLabel.setWrapText(true);

        VBox noteBox = new VBox(5);
        noteBox.getChildren().addAll(titleLabel, contentLabel);

        noteBox.setStyle(
                "-fx-border-color: gray;" +
                        "-fx-border-radius: 5;" +
                        "-fx-padding: 10;"
        );

        notesContainer.getChildren().add(noteBox);

        titleField.clear();
        contentArea.clear();
    }
}
