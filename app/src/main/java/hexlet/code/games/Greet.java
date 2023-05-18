package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static void welcomeUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
