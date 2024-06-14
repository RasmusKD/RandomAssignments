import java.util.Arrays;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // should return true
        System.out.println(isPalindrome("Hello, World!")); // should return false
    }

    public static boolean isPalindrome(String str) {
        str = cleanString(str);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static String cleanString(String word) {
        return word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}//14-06-2024
