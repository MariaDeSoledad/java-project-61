package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.name;

public class Progression {
    public static void playProgression() {
        Engine.useEngine();
        System.out.println("What number is missing in the progression?");
        int count = 1;
        int k = 0;
        while (k == 0 && count < 4) {
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
            String answer = Engine.getInput();
            String stringMissingN = "";
            stringMissingN += startNumber + diff * missingNumber;
            if (answer.equals(stringMissingN)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + stringMissingN + "'.");
                System.out.println("Let's try again, " + name + "!");
                k -= 1;
            }
        }
        if (count == 4) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
