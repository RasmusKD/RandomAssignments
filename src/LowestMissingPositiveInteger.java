import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LowestMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antal pladser i arrayet:");
        int arrayLength = scanner.nextInt();
        int[] numArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Indtast tal " + (i + 1) + " i arrayet:");
            numArray[i] = scanner.nextInt();
        }
        int lowest = findLowestMissingInteger(numArray);
        System.out.println("Det laveste positive tal der mangler i arrayet er " + lowest);
        scanner.close();
    }

    public static int findLowestMissingInteger(int[] numArray) {
        Set<Integer> set = new HashSet<>();
        for (int i : numArray) {
            if (i > 0) {
                set.add(i);
            }
        }
        for (int i = 1; i <= numArray.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return numArray.length + 1;
    }
}
//13-06-2024