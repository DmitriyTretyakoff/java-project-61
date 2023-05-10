package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter the game number and press Enter.");
        System.out.println (" 1 - Greet \n 2 - Even \n 3 - Calc\n 4 - GCD\n 5 - Progression\n 6 - Prime \n 0 - Exit");
        System.out.print ("Your choice: ");
        int n = sc.nextInt ();
        switch (n){
            case 1:
                Cli.welcomeUser();
                break;
            case 2:
                GameEven.startGame();
                break;
            case 3:
                GameCalc.startGame ();
                break;
            case 5:
                GameProgression.startGame ();
                break;
            case 6:
                GamePrime.startGame ();
                break;
            case 0:
                System.out.println ("Exit");
                break;
        }
        sc.close();
//        if(n == 1) {
//            System.out.println ("Welcome to the Brain Games!");
//            System.out.print ("May I have your name? ");
//            String name = sc.next ();
//            System.out.println ("Hello, " + name + "!");
//        } else if(n == 2){
//            GameEven.startGame();
//        } else if ( n == 3) {
//            GameCalc.startGame ();
//        } else if (n == 4) {
//            GameGCD.startGame ();
//        } else if (n == 5) {
//            GameProgression.startGame ();
//        } else if (n == 6){
//            GamePrime.startGame ();
//        } else{
//            System.out.println ("Exit");
//        }
    }
}
