package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String name;
    public static Scanner sc = new Scanner(System.in);

    public static void useEngine() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(15) + 1;
    }

    public static int getRandomOperation() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public static String getInput() {
        return sc.nextLine();
    }
}
