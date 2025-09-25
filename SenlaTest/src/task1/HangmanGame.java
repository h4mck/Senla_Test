package task1;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class HangmanGame {
    private final String[] WORDS = {"программирование", "компьютер", "алгоритм",
            "интерфейс", "переменная", "функция", "инкапсуляция", "полиморфизм"};

    private String secretWord;
    private char[] guessedLetters;
    private Set<Character> guessedChars;
    private int lives;
    private boolean gameOver;
    private boolean won;

    public HangmanGame() {
        Random random = new Random();
        this.secretWord = WORDS[random.nextInt(WORDS.length)];
        this.guessedLetters = new char[secretWord.length()];
        Arrays.fill(guessedLetters, '_');
        this.guessedChars = new HashSet<>();
        this.lives = 6;
        this.gameOver = false;
        this.won = false;
    }

    public void makeGuess(char letter) {
        if (gameOver || guessedChars.contains(letter)) {
            return;
        }

        guessedChars.add(letter);
        boolean found = false;

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                guessedLetters[i] = letter;
                found = true;
            }
        }

        if (!found) {
            lives--;
        }

        checkGameStatus();
    }

    private void checkGameStatus() {
        if (lives <= 0) {
            gameOver = true;
            won = false;
            return;
        }

        boolean allGuessed = true;
        for (char c : guessedLetters) {
            if (c == '_') {
                allGuessed = false;
                break;
            }
        }

        if (allGuessed) {
            gameOver = true;
            won = true;
        }
    }

    public String getCurrentState() {
        return new String(guessedLetters);
    }

    public int getLives() {
        return lives;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isWon() {
        return won;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public Set<Character> getGuessedChars() {
        return new HashSet<>(guessedChars);
    }
}