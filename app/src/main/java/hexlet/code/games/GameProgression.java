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
        int rangeForRandom = 5;
        int length = Utils.generateNumber(rangeForRandom) + 6;
        int[] progression = new int[length];
        int randomFirstNumber = 11;
        firstNumber = Utils.generateNumber(randomFirstNumber);
        int randomDelta = 3;
        delta = Utils.generateNumber(randomDelta) + 1;
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
