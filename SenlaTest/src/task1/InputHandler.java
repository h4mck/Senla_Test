package task1;

import java.util.Scanner;

class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public char getLetterInput() {
        while (true) {
            System.out.print("Введите букву: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Пожалуйста, введите только одну букву!");
                continue;
            }

            char letter = input.charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("Пожалуйста, введите букву!");
                continue;
            }

            return letter;
        }
    }

    public void close() {
        scanner.close();
    }
}
