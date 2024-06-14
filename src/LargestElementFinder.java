import java.util.Scanner;

public class LargestElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal elementer i arrayet:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Indtast elementerne i arrayet:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int largest = findLargest(array);
        System.out.println("Det største element i arrayet er: " + largest);
        scanner.close();
    }

    public static int findLargest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
    return max;
    }
}
//14-06-2024