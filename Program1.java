import java.util.Scanner;
class Calculator {
    private double a;
    private double b;
    private String type_of_operation;
    public Calculator(double a, double b, String type_of_operation) {
        this.a = a;
        this.b = b;
        this.type_of_operation = type_of_operation;
    }
    public double calculate() {
        switch (type_of_operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation: " + type_of_operation);
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter any one of the mentioned operation (+, -, *, /): ");
        String type_of_operation = sc.next();      
        Calculator calc = new Calculator(a, b, type_of_operation);
        try {
            double result = calc.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

