import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast antal pladser i det første array:");
        int arrayLength1 = scanner.nextInt();
        int[] numArray1 = new int[arrayLength1];
        addNumbersToArray(numArray1, arrayLength1, scanner);

        System.out.println("Indtast antal pladser i det andet array:");
        int arrayLength2 = scanner.nextInt();
        int[] numArray2 = new int[arrayLength2];
        addNumbersToArray(numArray2, arrayLength2, scanner);

        Set<Integer> commonElements = findCommonElements(numArray1, numArray2);

        System.out.println("Fælles elementer: " + commonElements);
        scanner.close();
    }

    public static void addNumbersToArray(int[] numArray, int arrayLength, Scanner scanner) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Indtast tal " + (i + 1) + " i arrayet:");
            numArray[i] = scanner.nextInt();
        }
    }

    public static Set<Integer> findCommonElements(int[] numArray1, int[] numArray2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        for (int num : numArray1) {
            set.add(num);
        }
        for (int num : numArray2) {
            if (set.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }
}
//13-06-2024