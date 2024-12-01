public class Recursion {
    public static void main(String[] args) {
        // Definition of Recursion:
        // Recursion is a programming technique where a function calls itself
        // either directly or indirectly to solve a problem. It is typically 
        // used to solve problems that can be divided into smaller, similar sub-problems.

        // Example 1: Factorial of a number
        System.out.println("Factorial of 6: " + factorial(6));

        // Example 2: Nth Fibonacci number
        System.out.println("5th Fibonacci number: " + fibonacci(7));

        // Example 3: Reverse a string
        String str = "hello";
        System.out.println("Reverse of 'hello': " + reverseString(str));
    }

    // Recursive function to calculate factorial
    public static int factorial(int num) {
        if (num <= 1) return 1;
        return factorial(num - 1) * num; 
        //factorial(6) will call for factorial(5) * 6
        //factorial(5) will call for factorial(4) * 5
        //factorial(4) will call for factorial(3) * 4
        //factorial(3) will call for factorial(2) * 3
        //factorial(2) will call for factorial(1) * 2
        // factorial(1) is 1

        
    }

    // Recursive function to find the Nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base cases: fib(0) = 0, fib(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive function to reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) return ""; // Base case: empty string
        // Recursive case: reverse the rest of the string and add the first character to the end
        return reverseString(str.substring(1)) + str.charAt(0);

        // hello
        // reverse(hello ) will return  reverse(ello) +h
        // reverse(ello) will return reverse(llo) +e
        //reverse(llo) will return reverse(lo) +l
        // reverse(lo) will return reverse(o)+l
        // reverse(o) will return "" +o    
    }
}
