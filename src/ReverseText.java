import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast en tekst:");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        String reversedStr = reverse(charArray);
        System.out.println(reversedStr);
        scanner.close();
    }

    public static String reverse(char[] cArray) {
        char[] newArray = new char[cArray.length];
        for (int i = 0; i < cArray.length; i++) {
            newArray[i] = cArray[cArray.length - 1 - i];
        }
        return new String(newArray);
    }
}
//12-06-2024