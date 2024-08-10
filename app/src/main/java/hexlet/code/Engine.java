package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String name;
    public static void useEngine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        final int constF = 15;
        return rand.nextInt(constF) + 1;
    }

    public static int getRandomOperation() {
        Random rand = new Random();
        final int constThree = 3;
        return rand.nextInt(constThree);
    }
    public static int getRandomDifference() {
        Random rand = new Random();
        final int constFour = 4;
        return rand.nextInt(constFour) + 1;
    }
    public static int getRandomMissing() {
        Random rand = new Random();
        final int constTen = 10;
        return rand.nextInt(constTen);
    }
    public static String getName() {
        return name;
    }
    public static void correctMessage() {
        System.out.println("Correct!");
    }
    public static void wrongMessage(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + Engine.getName() + "!");
    }
    public static void finalMessage(int countOfSuccess, int theBorderOfAttempts) {
        if (countOfSuccess == theBorderOfAttempts) {
            System.out.println("Congratulations, " + Engine.getName()  + "!");
        }
    }
}
