import java.util.Scanner;

public class IT24102340Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Using ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        
        // Print the result
        System.out.println("The number is " + result);
        
        // Close the scanner
        scanner.close();
    }
}
