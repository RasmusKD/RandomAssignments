import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et ord eller en sætning");
        String str = scanner.nextLine();
        Map<Character, Integer> map = Count(str);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Character, Integer> Count (String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        return map;
    }
}
//13-06-2024