package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String checkScannerStringWithRegex(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() &&
                (res = scanner.next()).matches(regex)))
            view.printWrongInput(message);
        return res;
    }
}
