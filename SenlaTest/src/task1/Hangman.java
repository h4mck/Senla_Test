package task1;

public class Hangman {
    private HangmanGame game;
    private GallowsRenderer renderer;
    private InputHandler inputHandler;

    public Hangman() {
        this.game = new HangmanGame();
        this.renderer = new GallowsRenderer();
        this.inputHandler = new InputHandler();
    }

    public void play() {
        System.out.println("Добро пожаловать в игру 'Виселица'!");
        System.out.println("Угадайте слово по буквам. У вас есть 6 попыток.");

        while (!game.isGameOver()) {
            displayGameState();
            char letter = inputHandler.getLetterInput();
            game.makeGuess(letter);
        }

        displayFinalResult();
        inputHandler.close();
    }

    private void displayGameState() {
        System.out.println("\n" + "=".repeat(40));
        renderer.renderGallows(game.getLives());
        System.out.println("\nСлово: " + game.getCurrentState());
        System.out.println("Осталось попыток: " + game.getLives());
        System.out.println("Использованные буквы: " + game.getGuessedChars());
    }

    private void displayFinalResult() {
        System.out.println("\n" + "=".repeat(40));
        renderer.renderGallows(game.getLives());

        if (game.isWon()) {
            System.out.println("\nПоздравляем! Вы выиграли!");
            System.out.println("Загаданное слово: " + game.getSecretWord());
        } else {
            System.out.println("\nИгра окончена! Вы проиграли.");
            System.out.println("Загаданное слово: " + game.getSecretWord());
        }
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.play();
    }
}
