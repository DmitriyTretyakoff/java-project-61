package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameProgression {
    public static String DESCRIPTION = "What number is missing in the progression?";
    public static String[][] QUESTIONS_AND_ANSWERS = new String[3][2];
    public static int DELTA;
    public static int HIDDEN_INDEX;
    public static int FIRST_NUMBER;

    public static void startGame() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int[] progression = generateProgression();
            HIDDEN_INDEX = random.nextInt(progression.length);
            int hidden = progression[HIDDEN_INDEX];
            QUESTIONS_AND_ANSWERS[i][0] = buildQuestion(progression);
            QUESTIONS_AND_ANSWERS[i][1] = String.valueOf(hidden);
        }
        Engine.runGame(DESCRIPTION, QUESTIONS_AND_ANSWERS);
    }

    private static int[] generateProgression() {
        int length = Utils.generateNumber(5) + 6;
        int[] progression = new int[length];
        FIRST_NUMBER = Utils.generateNumber(11);
        DELTA = Utils.generateNumber(3) + 1;
        for (int i = 0; i < length; i++) {
            progression[i] = FIRST_NUMBER + i * DELTA;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            builder.append(i == HIDDEN_INDEX ? ".." : FIRST_NUMBER + i * DELTA);
            if (i != progression.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
