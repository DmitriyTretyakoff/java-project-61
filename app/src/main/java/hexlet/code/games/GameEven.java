package hexlet.code.games;

import hexlet.code.Engine;

public class GameEven {
    public static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] questionsAndAnswers = new String[3][2];


    public static void startGame() {
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int number = Utils.generateNumber(100) + 1;
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.runGame(description, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}