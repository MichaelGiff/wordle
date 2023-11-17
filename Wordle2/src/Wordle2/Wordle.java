package Wordle2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Wordle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Wordle!");
        System.out.println("Please select a difficulty level (1 or 2):");
        int difficultyLevel = scanner.nextInt();

        WordList wordList = new WordList();
        Word targetWord = wordList.getRandomWord(difficultyLevel);

        int maxGuesses = 6;
        for (int i = 0; i < maxGuesses; i++) {
            System.out.println("\nEnter your guess:");
            System.out.println(" hello");
            String guess = scanner.next();

            ArrayList<Character> correctLetters = new ArrayList<>();
            ArrayList<Character> misplacedLetters = new ArrayList<>();
            for (int j = 0; j < targetWord.getWord().length(); j++) {
                char targetLetter = targetWord.getWord().charAt(j);
                char guessLetter = guess.charAt(j);

                int index = targetWord.getWord().indexOf(guessLetter);
                if (index != -1) {
                    if (index == j) {
                        correctLetters.add(targetLetter);
                    } else {
                        misplacedLetters.add(targetLetter);
                    }
                }
            }

            System.out.println("Correct letters:");
            for (Character correctLetter : correctLetters) {
                System.out.print(correctLetter + " ");
            }

            System.out.println("\nMisplaced letters:");
            for (Character misplacedLetter : misplacedLetters) {
                System.out.print(misplacedLetter + " ");
            }

            if (guess.equals(targetWord.getWord())) {
                System.out.println("\nCongratulations! You guessed the word correctly!");
                break;
            }
        }

        //if (!guess.equals(targetWord.getWord())) {
            //System.out.println("\nSorry, you ran out of guesses. The word was: " + targetWord.getWord());
        //}
    }
}