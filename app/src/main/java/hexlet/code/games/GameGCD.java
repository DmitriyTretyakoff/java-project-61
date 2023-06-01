package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int ROWS = 3;
    public static final int COLUMNS = 2;
    public static final String[][] QUESTIONS_ANSWERS = new String[ROWS][COLUMNS];
    private static int maxDivisor = 1;

    public static void startGame() {
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int rangeForRandom = 100;
            int number1 = Utils.generateNumber(rangeForRandom) + 1;
            int number2 = Utils.generateNumber(rangeForRandom) + 1;
            QUESTIONS_ANSWERS[i][0] = (number1 + " " + number2);
            QUESTIONS_ANSWERS[i][1] = String.valueOf(divisor(number1, number2));
        }
        Engine.runGame(DESCRIPTION, QUESTIONS_ANSWERS);
    }

    private static int divisor(int number1, int number2) {
        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                maxDivisor = i;
            }
        }
        return maxDivisor;
    }
}
