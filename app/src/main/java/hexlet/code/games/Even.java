package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;


public class Even {
    public static void playEven() {
        Scanner sc = new Scanner(System.in);
        Engine.useEngine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countOfSuccess = 1;
        int countOfFailures = 0;
        int theBorderOfAttempts = 4;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (Math.abs(randomNumber) % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                countOfSuccess += 1;
            } else if (Math.abs(randomNumber) % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                countOfSuccess += 1;
            } else {
                countOfFailures -= 1;
                String rightAnswer;
                if (Math.abs(randomNumber) % 2 == 0) {
                    rightAnswer = "yes";
                } else {
                    rightAnswer = "no";
                }
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + Engine.getName() + "!");
            }
        }
        if (countOfSuccess == theBorderOfAttempts) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }
}
