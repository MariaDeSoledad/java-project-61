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
        final int theBorderOfAttempts = 4;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (Math.abs(randomNumber) % 2 == 0 && answer.equals("yes")) {
                Engine.correctMessage();
                countOfSuccess += 1;
            } else if (Math.abs(randomNumber) % 2 != 0 && answer.equals("no")) {
                Engine.correctMessage();
                countOfSuccess += 1;
            } else {
                countOfFailures -= 1;
                String rightAnswer;
                if (Math.abs(randomNumber) % 2 == 0) {
                    rightAnswer = "yes";
                } else {
                    rightAnswer = "no";
                }
                Engine.wrongMessage(answer, rightAnswer);
            }
        }
        Engine.finalMessage(countOfSuccess, theBorderOfAttempts);
    }
}
