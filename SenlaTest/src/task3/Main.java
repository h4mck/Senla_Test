package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        while (true) {
            System.out.print("Введите длину пароля (от 8 до 12 символов): ");
            length = scanner.nextInt();
            System.out.println();
            if (length <= 12 & length >= 8) {
                System.out.println(PasswordGenerator.generate(length));
                break;
            }
            else {
                System.out.println("Неверная длина пароля!");
            }
        }


    }

}
