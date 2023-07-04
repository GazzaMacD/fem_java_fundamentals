package decisions;
import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args){
        System.out.println("Please enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        grade = grade.toUpperCase();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent Job";
            case "B" -> "Great job";
            case "C" -> "Good Job";
            case "D" -> "You need to work to a little harder";
            case "F" -> "Unfortunately you have failed. Good luck for the next time";
            default -> "Error! Please enter a valid letter 'A' 'B' 'C' 'D' or 'F'";
        };
        System.out.println(message);

    }
}
