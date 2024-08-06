package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.name;

public class Calc {
    public static void playCalc() {
        Engine.useEngine();
        System.out.println("What is the result of the expression?");
        String[] operations = {" + ", " - ", " * " };
        int count = 1;
        int k = 0;
        while (k == 0 && count < 4) {
            var number1 = Engine.getRandomNumber();
            var number2 = Engine.getRandomNumber();
            var operation = Engine.getRandomOperation();
            System.out.println("Question: " + number1 + operations[operation] + number2);
            System.out.print("Your answer: ");
            String answer = Engine.getInput();
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
            if (answer.equals(stringResult)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + stringResult + "'.");
                System.out.println("Let's try again, " + name + "!");
                k -= 1;
            }
        }
        if (count == 4) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
