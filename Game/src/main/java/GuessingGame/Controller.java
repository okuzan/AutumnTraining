package GuessingGame;


import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (!model.compareGuess(processInput(scanner))) ;
        view.printString(View.congratulation);
        view.printString(View.history + model.getUserHistory());
        view.printString(View.attempts + " " + model.getUserHistory().size());
    }

    private int processInput(Scanner scanner) {
        int i;
        view.printString(prompt());
        while (true) {
            while (!scanner.hasNextInt()) { //not integer
                view.printString(View.wrongInput);
                view.printString(prompt());
                scanner.next();
            }
            i = scanner.nextInt();
            if (i <= model.getCurrentMin() || i >= model.getCurrentMax()) { //out of bounds
                view.printString(View.wrongInput);
                view.printString(prompt());
                continue;
            }
            break;
        }
        return i;
    }

    private String prompt() {
        return View.userPrompt + "\n" +
                View.opening + model.getCurrentMin() +
                View.middle + model.getCurrentMax() +
                View.closing + "\n";
    }
}
