package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class App {
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;
    private static final int FIFTH = 5;
    private static final int SIXTH = 6;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet \n 2 - Even \n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        int numberGames = sc.nextInt();
        switch (numberGames) {
            case FIRST:
                Greet.welcomeUser();
                break;
            case SECOND:
                GameEven.startGame();
                break;
            case THIRD:
                GameCalc.startGame();
                break;
            case FOURTH:
                GameGCD.startGame();
                break;
            case FIFTH:
                GameProgression.startGame();
                break;
            case SIXTH:
                GamePrime.startGame();
                break;
            case ZERO:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Введен неверный номер игры, возможные значения: 1-6.");
        }
        sc.close();
    }
}
