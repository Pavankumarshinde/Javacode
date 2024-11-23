@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // here we have Calculator as interface class and it have operate as abstract function.
}
public class LambdaExample {
    public static void main(String[] args) {
        // lambda , (parameters) -> function
        Calculator addition =   (a, b) -> a + b;  // Lambda for addition
        Calculator multiplication = (a, b) -> a * b;  // Lambda for multiplication
        Calculator division = (a,b) -> (b==0) ? -1: a/b ; // int x= (condition) ? m : n;
        Calculator subtraction = (a,b)-> a-b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 0));
        System.out.println("subtraction: " + subtraction.operate(10, 5));


    }
}



