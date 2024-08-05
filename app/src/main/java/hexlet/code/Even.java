package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 1;
        int k = 0;
        while (k == 0 && count < 4) {
            Random rand = new Random();
            int randomNumber = rand.nextInt();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (Math.abs(randomNumber) % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                count += 1;
            } else if (Math.abs(randomNumber) % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count += 1;
            } else {
                count += 1;
                k -= 1;
                String rightAnswer;
                if (Math.abs(randomNumber) % 2 == 0) {
                    rightAnswer = "yes";
                } else {
                    rightAnswer = "no";
                }
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
            }
        }
        if (count == 4) {
            System.out.println("Congratulations, " + name + "!");
        }
        sc.close();
    }
}
