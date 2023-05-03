package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;
public class GameProgression {
    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        System.out.println ("Welcome to the Brain Games!");
        System.out.print ("May I have your name? ");
        String name = sc.next ();
        System.out.println ("Hello, " + name + "!");
        System.out.println ("What number is missing in the progression?");
        int positiveCount = 0;
        int negativeCount = 0;
        while (positiveCount < 3 && negativeCount < 1) {
            int length = random.nextInt(6) + 5;
            int[] progression = new int[length];
            int hiddenIndex = random.nextInt(length);
            int firstNumber = random.nextInt(11);
            int delta = random.nextInt(3) + 1;
            System.out.print("Question: ");
            for (int i = 0; i < length; i++) {
                progression[i] = firstNumber + i * delta;
                if (i == hiddenIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }
            System.out.print("\nYour answer: ");
            int answer = sc.nextInt();
            if (answer == progression[hiddenIndex]) {
                System.out.println ("Correct!");
                positiveCount++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + hiddenIndex);
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
