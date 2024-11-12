import java.util.Scanner;
public class passKeyCheck {


    public static void main(String[] args) {
        // Set correct username and password
        String correctUsername = "user123";
        String correctPassword = "pass123";

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to keep track of attempts
        int attempts = 3;

        // Loop for three attempts
        while (attempts > 0) {
            // Prompt the user for username and password
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check if username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit loop if login is successful
            } else {
                attempts--; // Decrement attempts if incorrect
                System.out.println("Incorrect username or password. Attempts left: " + attempts);
            }

            // Check if attempts are exhausted
            if (attempts == 0) {
                System.out.println("Account locked. No more attempts left.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

    
