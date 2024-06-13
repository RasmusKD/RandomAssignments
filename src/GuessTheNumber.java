import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int guess;
        int guessCount = 0;

        do {
            System.out.println("Gæt et tal mellem 1 og 100:");
            guess = scanner.nextInt();
            guessCount += 1;
            // System.out.println(numberToGuess); debug
            
            if (guess < numberToGuess) {
                System.out.println("For lavt!");
            } else if (guess > numberToGuess) {
                System.out.println("For højt!");
            } else {
                System.out.println("Korrekt! Du gættede det på " + guessCount + " forsøg.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}
//13-06-2024