package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameCalc {
    public static String description;
    public static String[][] questionsAndAnswers;
    private static int result;

    public static void startGame() {
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        Cli name = new Cli ();
        name.welcomeUser ();
        description = "What is the result of the expression?";
        questionsAndAnswers = new String[3][2];
        char[] operators = {'+', '-', '*'};
        int randomOperatorIndex = random.nextInt (operators.length);
        char operator = operators[randomOperatorIndex];
        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt (100) + 1;
            int number2 = random.nextInt (100) + 1;
            questionsAndAnswers[i][0] = String.valueOf (number1 + operator + number2);
            questionsAndAnswers[i][1] = isCalculate (number1, operator, number2);
        }
        Engine.runGame (description, questionsAndAnswers);
    }

    private static String isCalculate(int number1, char operator, int number2) {
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
        return String.valueOf (result);
    }
}
