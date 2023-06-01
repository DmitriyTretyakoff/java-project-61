package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int ROWS = 3;
    public static final int COLUMNS = 2;
    public static final String[][] QUESTIONS_ANSWERS = new String[ROWS][COLUMNS];

    public static void startGame() {
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var rangeForRandom = 100;
            int number = Utils.generateNumber(rangeForRandom) + 1;
            QUESTIONS_ANSWERS[i][0] = String.valueOf(number);
            QUESTIONS_ANSWERS[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.runGame(DESCRIPTION, QUESTIONS_ANSWERS);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

