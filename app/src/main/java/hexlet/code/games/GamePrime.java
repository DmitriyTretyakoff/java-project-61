package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GamePrime {
    public static String description;
    public static String[][] questionsAndAnswers;
    public static boolean isPrime;
    public static int number;

    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        boolean isPrime = true;
        Cli name = new Cli ();
        name.welcomeUser ();
        description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        questionsAndAnswers = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt (100) + 1;
            questionsAndAnswers[i][0] = String.valueOf (number);
            questionsAndAnswers[i][1] = mbPrime () ? "true" : "false";
        }
        Engine.runGame (description, questionsAndAnswers);
    }

    private static boolean mbPrime() {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

