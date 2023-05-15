package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static String description;
    public static String[][] questionsAndAnswers;

    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        Cli name = new Cli ();
        name.welcomeUser ();
        description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        questionsAndAnswers = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt (100) + 1;
            questionsAndAnswers[i][0] = String.valueOf (number);
            questionsAndAnswers[i][1] = isEven (number) ? "true" : "false";
        }
        Engine.runGame (description, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}