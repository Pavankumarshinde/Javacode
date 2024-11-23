import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String[] args) {

        // try {
        //     // if there is no errror in this block.  Catch block will not execute
        //     // if there is a error, then it will execute the catch block.

            
        // } catch (Exception e) {
        //     // 
        //     // TODO: handle exception
        // }















        // Example 1: Arithmetic Exception Handling
        // try {
        //     int a = 10;
        //     int b = 0;
        //     System.out.println("Division result: " + (a / b));

        // } catch (Exception e) {
        //     System.out.println("Error: Cannot divide by zero.");
        // }
























        // try {
        //     // 
        //     //
        //     // 
        //     //
        //     // 
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // catch( )
        // {

        // }
        // catch()
        // {

        // }





        Example 2: Array Index Out of Bounds Handling
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[7]);
        } catch (Exception e) {
            System.out.println("Error: Array index is out of bounds.");
        } 
        
        
        
        
        
        
        
        

        // Example 3: One try and multiple catch
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // This might throw InputMismatchException

            System.out.print("Enter another integer: ");
            int divisor = scanner.nextInt();

            // This might throw ArithmeticException
            System.out.println("Result: " + (num / divisor));

            // Accessing an invalid array index
            int[] array = {10, 20, 30};
            int Index=scanner.nextInt();
            System.out.println("Accessing index 2: " + array[Index]);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } finally{
            System.out.println("this Try and catch block is completed");

        }

        
    }
}