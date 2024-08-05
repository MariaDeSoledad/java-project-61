package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Engine.name;

public class Even {
    public static void playEven() {
        Engine.useEngine();
        int count = 1;
        int k = 0;
        while (k == 0 && count < 4) {
            int randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = Engine.getInput();
            if (Math.abs(randomNumber) % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                count += 1;
            } else if (Math.abs(randomNumber) % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count += 1;
            } else {
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
    }
}
