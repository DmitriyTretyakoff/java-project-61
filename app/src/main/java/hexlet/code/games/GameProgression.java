package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameProgression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int ROWS = 3;
    public static final int COLUMNS = 2;
    public static final String[][] QUESTIONS_ANSWERS = new String[ROWS][COLUMNS];
    private static int delta;
    private static int hiddenIndex;
    private static int firstNumber;
    private static final int RANGE_FOR_RANDOM = 5;
    private static final int RANDOM_FIRST_NUMBER = 11;
    private static final int RANDOM_DELTA = 3;
    private static final int EXP = 6;

    public static void startGame() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int[] progression = generateProgression();
            hiddenIndex = random.nextInt(progression.length);
            int hidden = progression[hiddenIndex];
            QUESTIONS_ANSWERS[i][0] = buildQuestion(progression);
            QUESTIONS_ANSWERS[i][1] = String.valueOf(hidden);
        }
        Engine.runGame(DESCRIPTION, QUESTIONS_ANSWERS);
    }

    private static int[] generateProgression() {
        int length = Utils.generateNumber(RANGE_FOR_RANDOM) + EXP;
        int[] progression = new int[length];
        firstNumber = Utils.generateNumber(RANDOM_FIRST_NUMBER);
        delta = Utils.generateNumber(RANDOM_DELTA) + 1;
        for (int i = 0; i < length; i++) {
            progression[i] = firstNumber + i * delta;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            builder.append(i == hiddenIndex ? ".." : firstNumber + i * delta);
            if (i != progression.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
