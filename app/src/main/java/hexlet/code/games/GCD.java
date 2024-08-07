package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void playGCD() {
        Engine.useEngine();
        System.out.println("Find the greatest common divisor of given numbers.");
        int countOfSuccess = 1;
        int countOfFailures = 0;
        while (countOfFailures == 0 && countOfSuccess < 4) {
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
            String answer = Engine.getInput();
            if (answer.equals(result)) {
                System.out.println("Correct!");
                countOfSuccess += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                countOfFailures -= 1;
            }
        }
        if (countOfSuccess == 4) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }
}
