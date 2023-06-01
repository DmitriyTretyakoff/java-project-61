package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static void runGame(String DESCRIPTION, String[][] QUESTIONS_ANSWERS) {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        String answer;
        System.out.println(DESCRIPTION);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println("Question: " + QUESTIONS_ANSWERS[i][0]);
            answer = sc.next();
            if (QUESTIONS_ANSWERS[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;" + "(. Correct answer was '" + QUESTIONS_ANSWERS[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        sc.close();
    }
}

