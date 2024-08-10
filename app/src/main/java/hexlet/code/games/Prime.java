package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static void playPrime() {
        Scanner sc = new Scanner(System.in);
        Engine.useEngine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int countOfSuccess = 1;
        int countOfFailures  = 0;
        final int theBorderOfAttempts = 4;
        while (countOfFailures  == 0 && countOfSuccess < theBorderOfAttempts) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            String rightAnswer;
            int countDivide = 0;
            for (var i = 2; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    countDivide++;
                }
            }
            if (countDivide == 0 && number != 1) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            int[] results = Engine.checkAnswer(answer, rightAnswer, countOfSuccess, countOfFailures);
            countOfSuccess = results[0];
            countOfFailures = results[1];
        }
        Engine.finalMessage(countOfSuccess, theBorderOfAttempts);
    }
}

