package GuessingGame;

public class View {
    public static final String congratulation = "YOU WON! Have a nice day :-)";
    public static final String userPrompt = "Enter your guess...";
    public static final String wrongInput = "Wrong input";
    public static final String attempts = "It took you so many attempts:";
    public static final String opening = "-->] ";
    public static final String middle = " ? ";
    public static final String history = "Your guesses were as follows: ";
    public static final String closing = " [<--";

    public void printString(String str) {
        System.out.println(str);
    }
}
