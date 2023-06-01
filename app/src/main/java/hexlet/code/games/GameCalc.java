package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameCalc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static final int ROWS = 3;
    public static final int COLUMNS = 2;
    public static final String[][] QUESTIONS_ANSWERS = new String[ROWS][COLUMNS];

    public static void startGame() {
        Random random = new Random();
        char[] operators = {'+', '-', '*'};
        int randomOperatorIndex = random.nextInt(operators.length);
        char operator = operators[randomOperatorIndex];
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var rangeForRundom = 100;
            int number1 = Utils.generateNumber(rangeForRundom) + 1;
            int number2 = Utils.generateNumber(rangeForRundom) + 1;
            QUESTIONS_ANSWERS[i][0] = (number1 + " " + operator + " " + number2);
            QUESTIONS_ANSWERS[i][1] = String.valueOf(calculate(operator, number1, number2));
        }
        Engine.runGame(DESCRIPTION, QUESTIONS_ANSWERS);
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
            default:
                break;
        }
        return result;
    }
}
