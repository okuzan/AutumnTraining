package GuessingGame;

import java.util.ArrayList;
import java.util.List;

public class Model {
    static int MAX_INT = 100;
    static int MIN_INT = 0;

    private int currentMin = MIN_INT;
    private int currentMax = MAX_INT;

    private int secretNumber;
    private List<Integer> userHistory;

    public Model() {
        secretNumber = generateRandom();
        userHistory = new ArrayList<>();
        System.out.println(secretNumber);
    }

    public static int generateRandom() {
        return (int) (MIN_INT + 1 + Math.random() * ((MAX_INT - 1) - (MIN_INT + 1)));
    }

//
    public void setBarriers(int min, int max) {
        this.currentMin = min;
        this.currentMax = max;
    }

    public boolean compareGuess(int i) {
        userHistory.add(i);
        if (i == secretNumber)
            return true;
        else if (i > secretNumber)
            currentMax = i;
        else
            currentMin = i;
        return false;
    }

    public int getCurrentMin() {
        return currentMin;
    }

    public int getCurrentMax() {
        return currentMax;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public List<Integer> getUserHistory() {
        return userHistory;
    }
}
