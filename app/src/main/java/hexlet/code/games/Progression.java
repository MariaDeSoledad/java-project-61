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
        final int theBorderOfAttempts = 4;
        final int theLengthOfProgression = 10;
        while (countOfFailures == 0 && countOfSuccess < theBorderOfAttempts) {
            int startNumber = Engine.getRandomNumber();
            int diff = Engine.getRandomDifference();
            System.out.print("Question: ");
            int missingNumber = Engine.getRandomMissing();
            for (int i = 0; i < theLengthOfProgression; i++) {
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
                Engine.correctMessage();
                countOfSuccess += 1;
            } else {
                Engine.wrongMessage(answer, stringMissingN);
                countOfFailures -= 1;
            }
        }
        Engine.finalMessage(countOfSuccess, theBorderOfAttempts);
    }
}

