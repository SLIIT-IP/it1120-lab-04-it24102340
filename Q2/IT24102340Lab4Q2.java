  import java.util.Scanner;

public class IT24102340Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        // Prompt user to enter the lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labSubmissionMarks = scanner.nextDouble();

        // Prompt user to enter the percentage given for the exam
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        // Prompt user to enter the percentage given for the lab submission marks
        System.out.print("Please enter the percentage given for lab submission marks: ");
        double labSubmissionPercentage = scanner.nextDouble();

        // Validate the input values
        if (examMarks > 100 || labSubmissionMarks > 100) {
            System.out.println("Invalid input marks for exam or lab submission. Terminating program.");
        } else if (examPercentage + labSubmissionPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
        } else {
            // Calculate the final marks
            double finalMarks = (examMarks * examPercentage + labSubmissionMarks * labSubmissionPercentage) / 100;

            // Display the final marks
            System.out.printf("Final Exam mark is: %.2f%n", finalMarks);
        }

        scanner.close();
    }
}
