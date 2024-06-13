import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal pladser i arrayet:");
        int arrayLength = scanner.nextInt();
        int[] numArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Indtast tal " + (i + 1) + " i arrayet:");
            numArray[i] = scanner.nextInt();
        }
        System.out.println("Indtast antal positioner arrayet skal rykkes mod højre:");
        int positions = scanner.nextInt();

        positions = positions % arrayLength;

        System.out.println("Roteret array: " + Arrays.toString(rotateArray(numArray, positions)));
        scanner.close();
    }

    public static int[] rotateArray(int[] array, int pos) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[(i + pos) % array.length] = array[i];
        }
        return newArray;
    }
}
//12-06-2024