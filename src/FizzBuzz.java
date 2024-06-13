public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            else {
                System.out.print(i);
            }
            // Sætter komma mellem alle resultater pånær til sidst
            if (i < 100) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
//12-06-2024