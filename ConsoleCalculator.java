import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Console Calculator!");
        
        while (continueCalculation) {
            try {
                System.out.print("Enter the first number:");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter an operator (+, -, *, /):");
                char operator = scanner.nextLine().charAt(0);

                System.out.print("Enter the second number:");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = 0;
                boolean validOperation = true;

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
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        validOperation = false;
                }

                if (validOperation) {
                    System.out.println("Result: " + result);
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            }

            System.out.print("Do you want to perform another calculation? (y/n):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("y")) {
                continueCalculation = false;
            }
        }

        System.out.println("Thank you for using the Console Calculator. Goodbye!");
        scanner.close();
    }
}
