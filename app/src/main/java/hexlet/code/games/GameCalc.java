package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameCalc {
    private static final String description = "What is the result of the expression?";
    private static final String[][] questionsAndAnswers = new String[3][2];

    public static void startGame() {
        Random random = new Random();
        char[] operators = {'+', '-', '*'};
        int randomOperatorIndex = random.nextInt(operators.length);
        char operator = operators[randomOperatorIndex];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int number1 = Utils.generateNumber(100) + 1;
            int number2 = Utils.generateNumber(100) + 1;
            questionsAndAnswers[i][0] = (number1 + " " + operator + " " + number2);
            questionsAndAnswers[i][1] = String.valueOf(calculate(operator, number1, number2));
        }
        Engine.runGame(description, questionsAndAnswers);
    }

    private static int calculate(char operator, int number1, int number2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
        }
        return result;
    }
}
