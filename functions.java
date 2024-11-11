
public class functions {  

    public static void main(String[] args) {
       
    }



    

    public static float calculate(float num1, float num2, char operator) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            return num1 / num2;
        } else {
            System.out.println("Invalid operator.");
            return 0; // Default return if an invalid operator is provided
        }
    }
}
