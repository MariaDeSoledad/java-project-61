package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static void playEven() {
        Engine.useEngine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countOfSuccess = 1;
        int countOfFailures = 0;
        while (countOfFailures == 0 && countOfSuccess < 4) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = Engine.getInput();
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
        if (countOfSuccess == 4) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }
}
