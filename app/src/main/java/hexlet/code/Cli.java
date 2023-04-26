package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcomeUser(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next ();
        System.out.println ("May I have your name? " + name);
        System.out.println ("Hello, " + name + "!");
    }

}
