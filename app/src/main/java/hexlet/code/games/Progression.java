package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void playProgression() {
        Scanner sc = new Scanner(System.in);
        Engine.useEngine();
        System.out.println("What number is missing in the progression?");
        int countOfSuccess = 1;
        int countOfFailures = 0;
        int theBorderOfAttempts = 4;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            int startNumber = Engine.getRandomNumber();
            int diff = Engine.getRandomDifference();
            System.out.print("Question: ");
            int missingNumber = Engine.getRandomMissing();
            for (int i = 0; i < 10; i++) {
                if (i != missingNumber) {
                    System.out.print(startNumber + diff * i + " ");
                } else {
                    System.out.print(".. ");
                }
            }
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            String stringMissingN = "";
            stringMissingN += startNumber + diff * missingNumber;
            if (answer.equals(stringMissingN)) {
                System.out.println("Correct!");
                countOfSuccess += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + stringMissingN + "'.");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                countOfFailures -= 1;
            }
        }
        if (countOfSuccess == theBorderOfAttempts) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }
}
