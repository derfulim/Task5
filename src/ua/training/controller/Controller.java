package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.entity.FieldsNames;
import ua.training.model.entity.NotUniqueLoginException;
import ua.training.model.entity.NoteBook;
import ua.training.view.TextConstant;
import ua.training.view.View;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller implements TextConstant,RegexContainer {

//    FieldsNames fieldsNames;

    private Model model;
    private View view;
    private Map<String,String> notes = new LinkedHashMap();
    private Scanner scanner = new Scanner(System.in);
    private String userInput;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void createNoteBook() {
        prepareNotes();
        while (true){
            try{
            new NoteBook(notes.get(FieldsNames.NAME.getFieldName()), notes.get(FieldsNames.LOGIN.getFieldName()));
            break;
            }
            catch (NotUniqueLoginException e) {
                System.err.println("Not unique login " + e.getLogin());
                e.printStackTrace();
                inputLogin();
            }

        }
    }

    private void prepareNotes() {
        for (FieldsNames field : FieldsNames.values()) {
            view.printStringInput(field.getViewName());
            processUserInput(field.getRegexName(),field.getViewName());
            notes.put(field.getFieldName(),userInput);
        }
    }

    private void  processUserInput(String regex, String message) {
            while (!checkInputWithRegex(userInput = getUserInput(),regex)){
                view.printWrongStringInput(message);
            }
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private boolean checkInputWithRegex(String input,String regex) {
        if(input.matches(regex)) {
            return true;
        }
        else return false;
    }

    void inputLogin() {
        view.printStringInput(FieldsNames.LOGIN.getViewName());
        processUserInput(FieldsNames.LOGIN.getRegexName(),FieldsNames.LOGIN.getViewName());
        notes.put(FieldsNames.LOGIN.getFieldName(),userInput);
    }

}
