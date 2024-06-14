public class Stuttering {
    public static void main(String[] args) {
        System.out.println(stutter("incredible"));;

    }
    public static String stutter(String word) {
        return word.substring(0, 2) + "..." + word.substring(0, 2) + "..." + word;
    }
}
//14-06-2024
