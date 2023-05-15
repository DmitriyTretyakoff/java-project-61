package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    public final static int COUNT_ROUNDS = 3;

    public static void runGame(String description, String[][] questionsAndAnswers) {
        Scanner sc = new Scanner (System.in);
        Cli name = new Cli ();
        name.welcomeUser ();
        String answer = null;
        System.out.println (description);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println ("Question: " + questionsAndAnswers[i][0]);
            answer = sc.next ();
            if (questionsAndAnswers[i][1].equals (answer)) {
                System.out.println ("Correct!");
            } else {
                System.out.println ("'" + answer + "' is wrong answer ;" + "(. Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println ("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println ("Congratulations, " + name + "!");
        sc.close ();
    }
}

