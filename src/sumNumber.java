import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et tal:");

        int sum = 0;
        int num = scanner.nextInt();
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("summen er " + sum);
        scanner.close();
    }
}
//12-06-2024