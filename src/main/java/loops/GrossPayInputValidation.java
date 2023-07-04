/*
 * GrossPayInputValidation
 * v1.0
 * 2023-07-4
 */
package loops;

import java.util.Scanner;

/**
 * Allow employees to enter their hours worked per week.
 * NOTE: Does not allow for overtime to be entered
 *
 * @author Gareth Macdonald
 */

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;
        double minHours = 0;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("Invalid input, please enter a number between and including " + minHours + " and "  + maxHours + ".");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double weeklyPay = rate * hoursWorked;
        System.out.println("Weekly gross pay is: $" + weeklyPay);
    }
}
