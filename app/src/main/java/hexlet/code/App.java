package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class App {
    private static final int ODIN = 1;
    private static final int DWA = 2;
    private static final int TREE = 3;
    private static final int CHET = 4;
    private static final int PYAT = 5;
    private static final int SHEST = 6;
    private static final int NOOL = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet \n 2 - Even \n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        int numberGames = sc.nextInt();
        switch (numberGames) {
            case ODIN:
                Greet.welcomeUser();
                break;
            case DWA:
                GameEven.startGame();
                break;
            case TREE:
                GameCalc.startGame();
                break;
            case CHET:
                GameGCD.startGame();
                break;
            case PYAT:
                GameProgression.startGame();
                break;
            case SHEST:
                GamePrime.startGame();
                break;
            case NOOL:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Введен неверный номер игры, возможные значения: 1-6.");
        }
        sc.close();
    }
}
