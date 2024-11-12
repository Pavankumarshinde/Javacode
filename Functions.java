import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {

        // int result = add(5,3); // calling a function.
        // int x= add(5,6);
        // float ans=calculate(2, 5, '+');
        // System.out.println(ans);
        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        while (attempts > 0) {
            System.out.println("type username:");
            String username = scanner.nextLine();
            System.out.println("type Password:");
            String password = scanner.nextLine();
            boolean condition = passcheck(username, password);
            System.out.println(condition);
            if (condition == true) {
                System.out.println("Login Successfully");
                break;
            } else {
                System.out.println("Pls try Again");
            }
            attempts--;
        }

    }

    // Functions, or "methods" in Java, are reusable blocks of code designed to
    // perform specific tasks.

    // Syntax.
    // returnType functionName(parameter1Type parameter1, parameter2Type parameter2,
    // ...) {
    // Code to be executed
    // return value; // only if returnType is not void
    // }

    // public static float calculate(float num1, float num2, char operator) {
    // if (operator == '+') {
    // return num1 + num2;
    // } else if (operator == '-') {
    // return num1 - num2;
    // } else if (operator == '*') {
    // return num1 * num2;
    // } else if (operator == '/') {
    // return num1 / num2;
    // } else {
    // System.out.println("Invalid operator.");
    // return 0; // Default return if an invalid operator is provided
    // }
    // }

    // 2) Implement a basic login system that gives users 3 attempts to enter the
    // correct username
    // and password.

    public static boolean passcheck(String username, String password) {
        String CorrectUserName = "user123" ;
        String CorrectPassword = "passkey" ;
        System.out.println(username + " " + password);
        if (CorrectUserName.equals(username) && CorrectPassword.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    // public static boolean PasswordCheck(String username, String password) {

    // return true;

    // }

    // 3. Vowel Counter
    // Write a function countVowels that takes a String and returns the number of
    // vowels (a, e, i, o, u).
    // Ask the user to input a sentence and display the number of vowels using your
    // function.

    // public static int countVowels(String input) {
    // int count = 0;
    // input = input.toLowerCase();
    // for (int i = 0; i < input.length(); i++) {
    // char ch = input.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // count++;
    // }
    // }
    // return count;
    // }

    // 4. Prime Number Checker
    // Write a function isPrime that takes an integer as input and returns true if
    // the number is prime, and false otherwise.
    // Use Scanner to get a number from the user, call the function, and print if
    // the number is prime.
    // public static boolean isPrime(int number) {
    // if (number <= 1)
    // return false;
    // for (int i = 2; i <= Math.sqrt(number); i++) {
    // if (number % i == 0)
    // return false;
    // }
    // return true;
    // }

    // 5. Palindrome Checker
    // Write a function isPalindrome that takes a String and returns true if it
    // reads the same forwards and backwards.
    // Prompt the user to enter a word, call the function, and display whether it's
    // a palindrome.
    // public static boolean isPalindrome(String input) {
    // int left = 0;
    // int right = input.length() - 1;
    // while (left < right) {
    // if (input.charAt(left) != input.charAt(right)) {
    // return false;
    // }
    // left++;
    // right--;
    // }
    // return true;
    // }

    // 6. Factorial Calculator
    // Create a function factorial that calculates the factorial of a given number.
    // Ask the user to input a number, call factorial, and print the result.
    // public static int factorial(int number) {
    // int result = 1;
    // for (int i = 1; i <= number; i++) {
    // result *= i;
    // }
    // return result;
    // }
}
