package decisions;

import java.util.Scanner;

public record QuotaAchievedMessageGenerator() {
    public static void main(String[] args) {
        int quota = 10;
        String message;

        System.out.println("How many sales did employee achieve this week?");
        Scanner scanner = new Scanner(System.in);
        int weeklySales = scanner.nextInt();
        scanner.close();

        if(weeklySales >= quota){
            message = "Congratulations on achieving " + weeklySales + " sales this week.";
        } else {
            int salesDeficit = quota - weeklySales;
            String salesString = salesDeficit > 1 ? "sales": "sale";
           message = "You achieved " + (salesDeficit) + " " + salesString +  " less than your quota of " + quota + " sales this week. Better luck next week!";
        }
        System.out.println(message);
    }
}
