package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            Cli.greetUser();
        }
        if (choice.equals("2")) {
            Even.playEven();
        }
        if (choice.equals("3")) {
            Calc.playCalc();
        }
        if (choice.equals("4")) {
            GCD.playGCD();
        }
        if (choice.equals("5")) {
            Progression.playProgression();
        }
        if (choice.equals("6")) {
            Prime.playPrime();
        }
        sc.close();
    }
}
