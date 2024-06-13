import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et ord:");
        String word = scanner.next();

        int vowelCount = countVowels(word);
        System.out.println("Antal af vokaler i ordet: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'y' || ch == 'æ' || ch == 'ø' || ch == 'å') {
                count++;
            }
        }
        return count;
    }
}
//12-06-2024