package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private String firstName;
    private String login;

    public NoteBook(String firstName, String login) throws NotUniqueLoginException {
        this.firstName = firstName;

        if(!DBNoteBook.checkIfExists(login)) {
            this.login = login;
        }
        else throw new NotUniqueLoginException("Not unique login ", login);
    }
}
