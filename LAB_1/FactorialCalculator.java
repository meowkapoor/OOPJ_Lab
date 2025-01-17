// WAP in java to find factorial of a number.

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial using the main method
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}

