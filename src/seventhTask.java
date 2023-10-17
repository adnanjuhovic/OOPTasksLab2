import java.util.Scanner;
public class seventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess;
        int userGuess;
        int guessCount = 0;
        do {
            numberToGuess = drawNumber();
            guessCount = 0;
            while (true) {
                System.out.print("Guess the number (0-100): ");
                userGuess = scanner.nextInt();
                guessCount++;

                if (userGuess < numberToGuess) {
                    System.out.println("The number is greater. Guess count: " + guessCount);
                } else if (userGuess > numberToGuess) {
                    System.out.println("The number is lesser. Guess count: " + guessCount);
                } else {
                    System.out.println("Congratulations, your guess is correct!");
                    break;
                }
            }
            System.out.println("It took you " + guessCount + " guesses to find the number.");
        } while (scanner.nextInt() == 1);

    }

    public static int drawNumber() {
        return (int) (Math.random() * 101);
    }
}
