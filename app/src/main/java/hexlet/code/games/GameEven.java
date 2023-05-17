package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static String description;
    public static String[][] questionsAndAnswers;

    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        questionsAndAnswers = new String[3][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int number = Utils.generateNumber(100) + 1;//random.nextInt (100) + 1;
            questionsAndAnswers[i][0] = String.valueOf (number);
            questionsAndAnswers[i][1] = isEven (number) ? "yes" : "no";
        }
        Engine.runGame (description, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}