package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class App {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet \n 2 - Even \n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        int numberGames = sc.nextInt();
        switch (numberGames) {
            case ONE:
                Greet.welcomeUser();
                break;
            case TWO:
                GameEven.startGame();
                break;
            case THREE:
                GameCalc.startGame();
                break;
            case FOUR:
                GameGCD.startGame();
                break;
            case FIVE:
                GameProgression.startGame();
                break;
            case SIX:
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
