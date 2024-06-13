import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast det første tal:");
        double num1 = scanner.nextDouble();
        System.out.println("Indtast det andet tal:");
        double num2 = scanner.nextDouble();

        System.out.println("Indtast en operator (+, -, *, /):");
        String operator = scanner.next();

        double result = 0.0;
        boolean validOperation = true;

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Fejl: Division med nul er ikke tilladt.");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Fejl: Ugyldig operator.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("Resultatet af " + num1 + " " + operator + " " + num2 + " er " + result);
        }
        scanner.close();
    }
}
//13-06-2024