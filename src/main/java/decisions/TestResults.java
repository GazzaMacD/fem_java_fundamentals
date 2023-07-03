package decisions;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Please enter employees test score");
        Scanner scanner = new Scanner(System.in);
        int testScore = scanner.nextInt();
        scanner.close();
        char grade;
        if(testScore < 0 || testScore > 100) {
            throw new RuntimeException("Score must be between 0 and 100 inclusive");
        }
        else if (testScore < 60){
            grade = 'F';
        }
        else if (testScore < 70){
            grade = 'D';
        }
        else if (testScore < 80){
            grade = 'C';
        }
        else if (testScore < 90){
            grade = 'B';
        }
        else if (testScore <= 100){
            grade = 'A';
        } else {
            throw new RuntimeException("Unknown Issue");
        }
        System.out.println("Test grade is: " + grade);
    }
}
