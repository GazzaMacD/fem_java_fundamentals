/*
 * Cashier
 * v1.0
 * 2023-07-6
 */
package loops;

import java.util.Scanner;

/**
 * Adds up a determined number of prices entered
 *
 * @author Gareth Macdonald
 */

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to total up");
        Scanner scanner = new Scanner(System.in);
        int numItems = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < numItems; i += 1){
            System.out.println("Enter the cost of the item please.");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("The total is: " + total);
    }
}
