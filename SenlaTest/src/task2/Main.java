package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double roubles;

        while (true) {
            System.out.print("Введите кол-во рублей: ");
            String inputStr = scanner.nextLine();
            try {
                roubles = Double.parseDouble(inputStr.replace(',', '.'));
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа или введённый текст не является числом!");
            }
        }

        while (true) {
            System.out.println("Кол-во рублей: " + roubles);
            System.out.println("Действия:");
            System.out.println("1. Перевести в дирхамы");
            System.out.println("2. Перевести в доллары");
            System.out.println("3. Перевести в евро");
            System.out.println("4. Перевести в лиры");
            System.out.println("5. Перевести в йены");
            System.out.println("0. Остановить программу");
            System.out.print("Введите действие: ");

            String command = scanner.nextLine();

            switch (command) {
                case ("1") -> {
                    System.out.println("Кол-во дирхам: " + CurExchange.exchange(roubles, CurExchange.Currency.Dirhams));
                    System.out.println();
                    break;
                }
                case ("2") -> {
                    System.out.println("Кол-во долларов: " + CurExchange.exchange(roubles, CurExchange.Currency.Dollars));
                    System.out.println();
                    break;
                }
                case ("3") -> {
                    System.out.println("Кол-во евро: " + CurExchange.exchange(roubles, CurExchange.Currency.Euros));
                    System.out.println();
                    break;
                }
                case ("4") -> {
                    System.out.println("Кол-во лир: " + CurExchange.exchange(roubles, CurExchange.Currency.Liras));
                    System.out.println();
                    break;
                }
                case ("5") -> {
                    System.out.println("Кол-во йен: " + CurExchange.exchange(roubles, CurExchange.Currency.Yens));
                    System.out.println();
                    break;
                }
                case ("0") -> {
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Неверная команда!");
                    System.out.println();
                    break;
                }
            }
        }
    }

}
