public class CheckEnding {
    public static void main(String[] args) {
        System.out.println(checkEnding("abc" , "bca"));
    }
    public static boolean checkEnding(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++){
            if (str2.charAt(str2.length()-i-1) != str1.charAt(str1.length()-i-1))
                return false;
        }
        return true;
    }
}
//14-06-2024