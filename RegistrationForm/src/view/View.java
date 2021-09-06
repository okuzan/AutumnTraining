package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.TextConstant.INPUT_STRING_DATA;
import static view.TextConstant.WRONG_INPUT_DATA;

public class View {
    static String MESSAGE_BUNDLE_NAME = "messages";
//    ResourceBundle.getBundle();

    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
//            new Locale("ua","UA"));
            new Locale("en"));
//
    public String concatenateStrings(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) builder.append(s);
        return new String(builder);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printStringInput(String message) {
        printMessage(concatenateStrings(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
    public void printWrongInput(String message) {
        printMessage(concatenateStrings(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
