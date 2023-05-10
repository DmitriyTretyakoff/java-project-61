package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        String answerYes = "yes";
        String answerNo = "no";
        System.out.println ("Welcome to the Brain Games!");
        System.out.print ("May I have your name? ");
        String name = sc.next ();
        System.out.println ("Hello, " + name + "!");
        System.out.println ("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int positiveCount = 0;    // счетчик положительных ответов
        int negativeCount = 0;    // счетчик отрицательных ответов
        while (positiveCount < 3 && negativeCount < 1) {
            int t = random.nextInt (100) + 1;
            System.out.println ("Question: " + t);
            System.out.print ("Your answer: ");
            String answer = sc.next ();
            if ((t % 2 == 0 && answer.equalsIgnoreCase (answerYes)) || (t % 2 != 0 && answer.equalsIgnoreCase (answerNo))) {
                System.out.println ("Correct!");
                positiveCount++;
            } else {
                if (answer.equalsIgnoreCase (answerYes)) {
                    System.out.println ("'" + answerYes + "' is wrong answer ;" + "(. Correct answer was '" + answerNo + "'.");
                } else {
                    System.out.println ("'" + answerNo + "' is wrong answer ;" + "(. Correct answer was '" + answerYes + "'.");
                }
                negativeCount++;
            }
        }
        if (positiveCount >= 3) {
            System.out.println ("Congratulations, " + name + "!");
        } else {
            System.out.println ("Let's try again, " + name + "!");
        }
        sc.close();
    }
}

