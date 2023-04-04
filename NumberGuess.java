import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        int guess;

        System.out.println("I have picked a number between 1 and 100. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            }
        } while (guess != numberToGuess);

        System.out.println("Awesome! You guessed the number in " + numberOfGuesses + " guesses.");
    }
}
