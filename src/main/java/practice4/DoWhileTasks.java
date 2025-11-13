package practice4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // задачка на запрос положительного числа
        int number;

        do {
            System.out.println("Введите положительное число: ");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Ошибка!");
            }
        }
        while (number <= 0);
        System.out.println("Вы ввели положительное число: " + number);
        System.out.println();

        // задачка на проверку пароля
        sc.nextLine();
        String correctPassword = "1234";
        String input;
        do {
            System.out.println("Введите пароль: ");
            input = sc.nextLine();
            if (!input.equals(correctPassword)) {
                System.out.println("Неверный пароль, попробуйте снова. ");
            }
        }
        while (!input.equals(correctPassword));
        System.out.println("Пароль верный.");


        // задачка на вывод чисел от 1 до 10
        int i = 1;
        System.out.println("Числа от 1 до 10: ");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println();


        // задачка по завершению программы по команде exit
        String command;
        do {
            System.out.println("Введите команду 'exit' для выхода: ");
            command = sc.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Программа завершена.");


        // задачка по подсчету количества цифр в числе
        System.out.println("Введите число для подсчета цифр: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = Math.abs(n);

        do {
            count++;
            temp /= 10;
        } while (temp != 0);
        System.out.println("Количество цифр в числе: " + n + "-" + count);
    }
}
