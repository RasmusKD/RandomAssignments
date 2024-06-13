import java.util.Scanner;

public class SecondLargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal pladser i arrayet:");
        int arrayLength = scanner.nextInt();
        int[] numArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Indtast tal " + (i + 1) + " i arrayet:");
            numArray[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            if (numArray[i] > max) {
                secondHighest = max;
                max = numArray[i];
            } else if (numArray[i] > secondHighest && numArray[i] < max) {
                secondHighest = numArray[i];
            }
        }

        System.out.println("Det næststørste tal er: " + secondHighest);
        scanner.close();
    }
}
//12-06-2024