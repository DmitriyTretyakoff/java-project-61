package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameProgression {
    public static String description = "What number is missing in the progression?";
    public static String[][] questionsAndAnswers = new String[3][2];
    public static int delta;
    public static int hiddenIndex;
    public static int firstNumber;

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            String[] progression = generateProgression();
            hiddenIndex = random.nextInt(progression.length);
            int hidden = Integer.parseInt(progression[hiddenIndex]);
            questionsAndAnswers[i][0] = Arrays.toString(buildQuestion(progression));
            questionsAndAnswers[i][1] = String.valueOf(hidden);
        }
        Engine.runGame(description, questionsAndAnswers);
    }

    private static String[] generateProgression() {
        int length = Utils.generateNumber(6) + 5;
        String[] progression = new String[length];
        firstNumber = Utils.generateNumber(11);
        delta = Utils.generateNumber(3) + 1;
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(firstNumber + i * delta);
        }
        return progression;
    }

    private static String[] buildQuestion(String[] progression) {
        progression[hiddenIndex] = "..";
        return progression;
    }
}
