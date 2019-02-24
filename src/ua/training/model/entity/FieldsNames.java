package ua.training.model.entity;

import ua.training.controller.RegexContainer;
import ua.training.view.TextConstant;

public enum FieldsNames implements TextConstant, RegexContainer {

    NAME("firstName",FIRST_NAME, REGEX_NAME_LAT),
    LOGIN("login",LOGIN_DATA, REGEX_LOGIN);


    private String fieldName;
    private String viewName;
    private String regexName;

    FieldsNames(String fieldName, String viewName, String regexName) {
        this.fieldName = fieldName;
        this.viewName = viewName;
        this.regexName = regexName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getViewName() {
        return viewName;
    }

    public String getRegexName() {
        return regexName;
    }
}
