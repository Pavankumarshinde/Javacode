import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String[] args) {

        // Example 1: Arithmetic Exception Handling
        // try {
        //     int a = 10;
        //     int b = 0;
        //     System.out.println("Division result: " + (a / b));
        // } catch (ArithmeticException e) {
        //     System.out.println("Error: Cannot divide by zero.");
        // }

        // // Example 2: Array Index Out of Bounds Handling
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (Exception e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        finally{
            System.out.println("Operations completed");
        }
        

       
    }
}

