import java.util.Scanner;

public class scanner {
     // Create a Scanner object to read input
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take an integer input 
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
      
      //   // Take a float input
        System.out.print("Enter a float number: ");
        float floatInput = scanner.nextFloat();

        // Consume the newline character after nextFloat
      //   scanner.nextLine();

      //   // Take a string input
        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();

        // Display the inputs
        System.out.println("You entered integer: " + integerInput);
        System.out.println("You entered float: " + floatInput);
        System.out.println("You entered string: " + stringInput);

        // Close the scanner
        scanner.close();
         
     }
       
    
}
