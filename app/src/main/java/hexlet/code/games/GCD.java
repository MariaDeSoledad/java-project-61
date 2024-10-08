package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void playGCD() {
        Scanner sc = new Scanner(System.in);
        Engine.useEngine();
        System.out.println("Find the greatest common divisor of given numbers.");
        int countOfSuccess = 1;
        int countOfFailures = 0;
        final int theBorderOfAttempts = 4;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            var number1 = Engine.getRandomNumber();
            var number2 = Engine.getRandomNumber();
            System.out.println("Question: " + number1 + " " + number2);
            String result = "";
            for (var i = Math.min(Math.abs(number1), Math.abs(number2)); i > 0; i--) {
                if (Math.abs(number1) % i == 0 && Math.abs(number2) % i == 0) {
                    result += i;
                    break;
                }
            }
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            int[] results = Engine.checkAnswer(answer, result, countOfSuccess, countOfFailures);
            countOfSuccess = results[0];
            countOfFailures = results[1];
        }
        Engine.finalMessage(countOfSuccess, theBorderOfAttempts);
    }
}

