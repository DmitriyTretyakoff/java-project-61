package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameGCD {
    public static void startGame(){
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        System.out.println ("Welcome to the Brain Games!");
        System.out.print ("May I have your name? ");
        String name = sc.next ();
        System.out.println ("Hello, " + name + "!");
        System.out.println ("Find the greatest common divisor of given numbers.");
        int correctAnswers = 0;
        int maxDivisor = 1;
        while (correctAnswers < 3){
            int t = random.nextInt (100) + 1;
            int d = random.nextInt (100) + 1;
            System.out.println ("Question: " +  t + " " + d);
            System.out.print ("Your answer: ");
            for (int i = 1; i <= Math.min(t, d); i++) {
                if (t % i == 0 && d % i == 0) {
                    maxDivisor = i;
                }
            }
            int answer = sc.nextInt ();
            if ( answer == maxDivisor) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + maxDivisor);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        sc.close();
    }
}

