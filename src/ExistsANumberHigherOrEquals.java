public class ExistsANumberHigherOrEquals {
    public static void main(String[] args) {
        existsHigherOrEquals(new int[]{5, 3, 15, 22, 4}, 10);
        existsHigherOrEquals(new int[] {4, 3, 3, 3, 2, 2, 2}, 4);
        System.out.println(existsHigherOrEquals(new int[] {4, 3, 3, 3, 2, 2, 2}, 4));
    }
    public static boolean existsHigherOrEquals(int[] arr, int n) {
        if (arr.length < 1){
            return false;
        }
        for (int i : arr) {
            if (i >= n) {
                return true;
            }
        }
        return false;
    }
}//14-06-2024