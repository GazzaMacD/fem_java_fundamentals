/*
 * SimpleAddition
 * v1.0
 * 2023-07-4
 */

package loops;

import java.util.Scanner;

/**
 * Allow user to enter two doubles and give them the result.
 *
 * @author Gareth Macdonald
 */

public class SimpleAddition {
    public static void main(String[] args) {
        System.out.println("Please follow the instructions below to add your numbers.");
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Please enter the first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Please enter the second number");
            double secondNumber = scanner.nextDouble();

            System.out.println("Result of  addition is: " + (firstNumber + secondNumber));
            System.out.println("Would you like to enter another pair of numbers, type 'true' to continue or 'false' to quit");
            again  = scanner.nextBoolean();
        } while (again);
        scanner.close();
        System.out.println("Thanks for using our program, see you again.");
    }
}
