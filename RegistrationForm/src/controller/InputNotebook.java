package controller;

import view.View;

import java.util.Scanner;

import static controller.Regexes.*;
import static view.TextConstant.*;

public class InputNotebook {
    private View view;
    private Scanner sc;
    private String firstName;
    private String login;

    public InputNotebook(View view, Scanner sc){
        this.view = view;
        this.sc= sc;
    }
    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = View.bundle.getString(NAME_REGEX);

        this.firstName =
                utilityController.checkScannerStringWithRegex
                        (FIRST_NAME_DATA, str);
        this.login =
                utilityController.checkScannerStringWithRegex
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
