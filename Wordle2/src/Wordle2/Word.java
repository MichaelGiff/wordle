package Wordle2;

class Word {
    private String word;
    private int difficultyLevel;

    public Word(String word, int difficultyLevel) {
        this.word = word;
        this.difficultyLevel = difficultyLevel;
    }

    public String getWord() {
        return word;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
