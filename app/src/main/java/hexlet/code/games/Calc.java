package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        Scanner sc = new Scanner(System.in);
        Engine.useEngine();
        System.out.println("What is the result of the expression?");
        String[] operations = {" + ", " - ", " * " };
        int countOfSuccess = 1;
        int countOfFailures = 0;
        final int theBorderOfAttempts = 4;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            var number1 = Engine.getRandomNumber();
            var number2 = Engine.getRandomNumber();
            var operation = Engine.getRandomOperation();
            System.out.println("Question: " + number1 + operations[operation] + number2);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            int intResult;
            if (operation == 0) {
                intResult = number1 + number2;
            } else if (operation == 1) {
                intResult = number1 - number2;
            } else {
                intResult = number1 * number2;
            }
            String stringResult = "";
            stringResult += intResult;
            int[] results = Engine.checkAnswer(answer, stringResult, countOfSuccess, countOfFailures);
            countOfSuccess = results[0];
            countOfFailures = results[1];
        }
        Engine.finalMessage(countOfSuccess, theBorderOfAttempts);
    }
}
