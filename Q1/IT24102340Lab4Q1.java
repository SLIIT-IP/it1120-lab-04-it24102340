 import java.util.Scanner;
 
 public class IT24102340Lab4Q1 {
     public static void main(String[] args) {
         // Create a Scanner object to read input from the keyboard
         Scanner scanner = new Scanner(System.in);


        // Prompt user for to enter number
           System.out.print("Enter the number:");
        // Read the input from the keyboard
           double number = scanner.nextDouble();
 
        // Check the input value is Positive,Negative or Zero
              if(number > 0  )  {
               System.out.println("The number is : Positive");
                                 }

         // Check the inputvalue is Positive,Negative or Zero
           else if(number < 0  )  {
               System.out.println("The number is : Negative");  
                                 }


         // Check the inputvalue is Positive,Negative or Zero
           else  {
               System.out.println("The number is : Zero"); 
                                 }
     
 
        // Close the scanner
        scanner.close();

      }
}