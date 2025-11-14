package practiceFour;
import java.util.Scanner;


public class DoWhileTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 задача
        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Отлично! Вы ввели положительное число: ");


        // 2 задача
        scanner.nextLine();
        String correctPassword ="1234";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
            if (!input.equals(correctPassword)) {
                System.out.println("Неверный пароль, попробуйте снова. ");
            }
        } while (!input.equals(correctPassword));
        System.out.println("Поздравляем! Правильный пароль.");


        // 3 задача
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 10);

        // 4 задача
        String command;
        do{
            System.out.print("Введите команду для завершения работы: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Программа завершена.");

        // 5 задача
        System.out.print("Введите число: ");
        int number1 = scanner.nextInt();
        int count = 0;
        int n = number1;

        if (n == 0) {
            count = 1;
        } else {
            do {
                count++;
                n = n / 10;
            } while (n != 0);
        }
        System.out.println("Количество цифр в числе: " + number1 + " - " + count);

    }



}
