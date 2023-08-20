import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
    	System.out.println("\t********** Number Guessing Game *********");
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        Scanner sc1 = new Scanner(System.in);
        boolean playAgain;
        do {
            playGame(); // call subroutine to play one game
            System.out.print("Would you like to play again? (Y/N): ");
            String playAgainInput = sc1.next();
            playAgain = playAgainInput.equalsIgnoreCase("Y");
        } while (playAgain);
        System.out.println("\tThanks for playing \uD83D\uDE42.\n\tGoodbye \uD83D\uDC4B.");
        System.out.println("******************************************");
    }

    static void playGame() {
        int computersNumber;
        int usersGuess;
        int guessCount;
        computersNumber = (int) (100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.println("What is your first guess?");
        Scanner sc = new Scanner(System.in);
        while (true) {
            usersGuess = sc.nextInt();
            guessCount++;
            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount
                        + " guesses! My number was " + computersNumber);
                break;
            }
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;
            }
            if (usersGuess < computersNumber)
                System.out.println("That's too low. Try again:");
            else if (usersGuess > computersNumber)
                System.out.println("That's too high. Try again:");
        }
        System.out.println();
    }

}
