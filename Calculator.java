import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        char operator;
        double num2;
        double result = 0;
        boolean validOperator = true;

        // first input
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // second input
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // last input
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.println(result);
        }

        scanner.close();

    }
}
