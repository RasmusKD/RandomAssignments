import java.util.Scanner;

public class PrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Instast et tal");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println(num + " er ikke et primtal");
        } else {
            System.out.println("Er tallet et primtal? " + checkPrime(num));
        }
        scanner.close();
    }

    public static boolean checkPrime (int num) {
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
         return true;
    }
}
//12-06-2024