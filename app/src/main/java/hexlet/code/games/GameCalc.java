package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameCalc {
    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        int result = 0;
        char[] operators = {'+', '-', '*'};
        int randomOperatorIndex = random.nextInt (operators.length);
        char operator = operators[randomOperatorIndex];
        System.out.println ("Welcome to the Brain Games!");
        System.out.print ("May I have your name? ");
        String name = sc.next ();
        System.out.println ("Hello, " + name + "!");
        System.out.println ("What is the result of the expression?");
        int positiveCount = 0;
        int negativeCount = 0;
        while (positiveCount < 3 && negativeCount < 1) {
            int t = random.nextInt (100) + 1;
            int d = random.nextInt (100) + 1;
            System.out.println ("Question: " + t + " " + operator + " " + d);
            switch (operator) {
                case '+':
                    result = t + d;
                    break;
                case '-':
                    result = t - d;
                    break;
                case '*':
                    result = t * d;
                    break;
            }
            System.out.print ("Your answer: ");
            int answer = sc.nextInt ();
            if (answer == result) {
                System.out.println ("Correct!");
                positiveCount++;
            } else {
                System.out.println ("'" + answer + "' is wrong answer ;" + "(. Correct answer was '" + result + "'.");
                negativeCount++;
            }
        }
        if (positiveCount >= 3) {
            System.out.println ("Congratulations, " + name + "!");
        } else {
            System.out.println ("Let's try again, " + name + "!");
        }
    }
}
