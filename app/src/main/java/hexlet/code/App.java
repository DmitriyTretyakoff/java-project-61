package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(" 1 - Greet \n 2 - Even \n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Greet.welcomeUser();
                break;
            case 2:
                GameEven.startGame();
                break;
            case 3:
                GameCalc.startGame();
                break;
            case 4:
                GameGCD.startGame();
                break;
            case 5:
                GameProgression.startGame();
                break;
            case 6:
                GamePrime.startGame();
                break;
            case 0:
                System.out.println("Exit");
                break;
        }
        sc.close();
    }
}
