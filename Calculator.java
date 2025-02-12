import java.util.Scanner; // Import Scanner class for user input

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // Read first number

        // Prompt user for operator (+, -, *, /)
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read operator

        // Prompt user for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // Read second number

        double result = 0; // Initialize result variable to avoid compilation errors

        // Perform the calculation based on the chosen operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero case
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, * or /.");
                return; // Exit the program if invalid operator is entered
        }

        // Display the final result
        System.out.println("Result: " + result);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}