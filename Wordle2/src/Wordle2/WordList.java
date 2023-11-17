package Wordle2;
import java.util.ArrayList;
import java.util.Random;
class WordList {
    private ArrayList<Word> words;

    public WordList() {
        this.words = new ArrayList<>();
        this.words.add(new Word("apple", 1));
        this.words.add(new Word("chunk", 1));
        this.words.add(new Word("bumpy", 1));
        this.words.add(new Word("grape", 2));
        this.words.add(new Word("adieu", 2));
        this.words.add(new Word("claps", 2));
    }

    public Word getRandomWord(int difficultyLevel) {
        ArrayList<Word> filteredWords = new ArrayList<>();
        for (Word word : words) {
            if (word.getDifficultyLevel() == difficultyLevel) {
                filteredWords.add(word);
            }
        }

        Random random = new Random();
        int randomIndex = random.nextInt(filteredWords.size());
        return filteredWords.get(randomIndex);
    }
}
