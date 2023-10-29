import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 student marks
        int[] marks = new int[10];

        // Input marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Sort the marks in ascending order
        Arrays.sort(marks);

        // Print the table header
        System.out.println("\nStudent Marks and Grades");
        System.out.println("----------------------------");
        System.out.println("Student\t\tMarks\t\tGrade");
        System.out.println("----------------------------");

        // Iterate through the marks and assign grades
        for (int i = 0; i < 10; i++) {
            int mark = marks[i];
            String grade;

            if (mark >= 40 && mark <= 50) {
                grade = "PASS";
            } else if (mark >= 51 && mark <= 75) {
                grade = "MERIT";
            } else {
                grade = "DISTINCTION";
            }

            System.out.println("Student " + (i + 1) + "\t\t" + mark + "\t\t" + grade);
        }

        scanner.close();
    }
}
