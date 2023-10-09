import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter value for 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Enter type of operation (add/subtract/multiply/divide): ");
        String operation = scanner.next();

        double result = 0.0;

        switch (operation.toLowerCase()) {
            case "add":
                result = calculator.add(a, b);
                break;
            case "subtract":
                result = calculator.subtract(a, b);
                break;
            case "multiply":
                result = calculator.multiply(a, b);
                break;
            case "divide":
                result = calculator.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
