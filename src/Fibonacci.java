import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast hvor mange tal i Fibonacci-sekvensen der skal genereres:");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Antallet skal være et positivt heltal.");
        } else {
            int num1 = 0, num2 = 1;
            System.out.print("Fibonacci-sekvensen: ");

            for (int i = 1; i <= count; i++) {
                System.out.print(num1);
                if (i < count) {
                    System.out.print(", ");
                }

                int nextNum = num1 + num2;
                num1 = num2;
                num2 = nextNum;
            }
            System.out.println();
        }
        scanner.close();
    }
}
//13-06-2024