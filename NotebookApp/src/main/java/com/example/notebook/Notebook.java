package com.example.notebook;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Note> notes;

    //constructor
    public Notebook() {
        notes = new ArrayList<>();
    }

    //add a note
    public void addNote(Note note) {
        notes.add(note);
    }

    //get all notes
    public List<Note> getNotes() {
        return notes;
    }
}
