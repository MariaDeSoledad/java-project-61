package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void playPrime() {
        Engine.useEngine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int countOfSuccess = 1;
        int countOfFailures  = 0;
        while (countOfFailures  == 0 && countOfSuccess < 4) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = Engine.getInput();
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
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                countOfSuccess += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                countOfFailures  -= 1;
            }
        }
        if (countOfSuccess == 4) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }
}
