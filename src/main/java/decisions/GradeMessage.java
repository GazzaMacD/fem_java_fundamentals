package decisions;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Please enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        grade = grade.toUpperCase();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work to a little harder";
                break;
            case "F":
                message = "Unfortunately you have failed. Good luck for the next time";
             default:
                message = "Error! Please enter a valid letter 'A' 'B' 'C' 'D' or 'F'";
        }
        System.out.println(message);

    }
}
