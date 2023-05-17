package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GamePrime {
    public static String description;
    public static String[][] questionsAndAnswers;
    public static boolean prime;
    public static int number;

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        questionsAndAnswers = new String[3][2];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int number = Utils.generateNumber(100) + 1;
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.runGame(description, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}

