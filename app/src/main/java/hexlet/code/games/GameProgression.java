package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameProgression {
    public static String description;
    public static String[][] questionsAndAnswers;
    public static int[] progression;
    public static int length;
    public static int delta;
    public static int hiddenIndex;
    public static int firstNumber;

    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        Cli name = new Cli ();
        name.welcomeUser ();
        description = "What number is missing in the progression?";
        questionsAndAnswers = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int length = random.nextInt (6) + 5;
            int[] progression = new int[length];
            int hiddenIndex = random.nextInt (length);
            int firstNumber = random.nextInt (11);
            int delta = random.nextInt (3) + 1;
            int number1 = random.nextInt (100) + 1;
            int number2 = random.nextInt (100) + 1;
            questionsAndAnswers[i][0] = String.valueOf (progression[i] + " ");
            questionsAndAnswers[i][1] = findNumber ();
        }
    }

    private static String findNumber() {
        for (int i = 0; i < length; i++) {
            progression[i] = firstNumber + i * delta;
            if (i == hiddenIndex) {
                System.out.print (".. ");
            } else {
                System.out.print (progression[i] + " ");
            }
        }
        return String.valueOf (hiddenIndex);
    }
}
