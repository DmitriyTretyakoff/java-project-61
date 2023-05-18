package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GameGCD {
    public static String description = "Find the greatest common divisor of given numbers.";
    public static String[][] questionsAndAnswers = new String[3][2];
    public static int maxDivisor = 1;

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int number1 = Utils.generateNumber(100) + 1;
            int number2 = Utils.generateNumber(100) + 1;
            questionsAndAnswers[i][0] = String.valueOf(number1 + " " + number2);
            questionsAndAnswers[i][1] = String.valueOf(divisor(number1, number2));
        }
        Engine.runGame(description, questionsAndAnswers);
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

