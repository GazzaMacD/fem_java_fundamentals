package decisions;

import java.util.Scanner;

public class QuotaRelatedSalaryCalculator {
    public static void main(String[] args) {
        double baseSalary = 1000;
        double bonus = 200;
        int weeklyQuota = 10;

        System.out.println("How many sales did employee achieve this week?");
        Scanner scanner = new Scanner(System.in);
        int weeklySales = scanner.nextInt();
        scanner.close();

        double totalSalary = baseSalary;
        if(weeklySales > weeklyQuota) {
            totalSalary = baseSalary + bonus;
        }

        System.out.println("Total weekly salary is $" + totalSalary);
    }
}
