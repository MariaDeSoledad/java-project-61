package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.name;

public class Prime {
    public static void playPrime() {
        Engine.useEngine();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 1;
        int k = 0;
        while (k == 0 && count < 4) {
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
            if (countDivide == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                k -= 1;
            }
        }
        if (count == 4) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
