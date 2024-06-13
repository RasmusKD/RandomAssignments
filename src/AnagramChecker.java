import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first word");
        String word1 = scanner.next();
        System.out.println("Write the second word");
        String word2 = scanner.next();
        boolean isAnagram = checkAnagram(word1, word2);

        if (isAnagram) {
            System.out.println("The strings are anagrams");
        }
        else {
            System.out.println("The strings are not anagrams");
        }
        scanner.close();
    }

    public static boolean checkAnagram(String word1, String word2) {
        // Clean and sort the strings
        String sortedWord1 = cleanAndSort(word1);
        String sortedWord2 = cleanAndSort(word2);

        // Compare the sorted strings
        return sortedWord1.equals(sortedWord2);
    }

    private static String cleanAndSort(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
//12-06-2024