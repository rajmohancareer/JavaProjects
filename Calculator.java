// Importing Scanner class to take user input
import java.util.Scanner;

// Main class of the program
public class Calculator {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Displaying a welcome message
        System.out.println("Simple Calculator in Java");

        // Asking the user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();  // Reads a decimal number (double)

        // Asking the user to enter an operator (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);  // Reads a single character input

        // Asking the user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();  // Reads another decimal number

        double result;  // Variable to store the result of the calculation

        // Using a switch-case to perform the operation based on the user's input
        switch (operator) {
            case '+':  // If the user enters '+', perform addition
                result = num1 + num2;
                break;
            case '-':  // If the user enters '-', perform subtraction
                result = num1 - num2;
                break;
            case '*':  // If the user enters '*', perform multiplication
                result = num1 * num2;
                break;
            case '/':  // If the user enters '/', perform division
                if (num2 != 0) {  // Checking to avoid division by zero
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;  // Exiting the program if division by zero is attempted
                }
                break;
            default:  // If the user enters an invalid operator
                System.out.println("Invalid operator!");
                return;  // Exiting the program
        }

        // Displaying the result of the calculation
        System.out.println("The result is: " + result);

        // Closing the scanner to avoid memory leaks
        scanner.close();
    }
}
