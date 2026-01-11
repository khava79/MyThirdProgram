package practice4;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Отрицательное число!");
                break;

            }

            sum += number;
            System.out.println("Текущая сумма: " + sum);
        }
        System.out.println("Итоговая сумма всех положительных чисел: " + sum);


        // 2 задача
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println("Число: " + i);
        }

        System.out.println("Цикл завершен.");


        // 3 задача
        while (true) {
            System.out.print("Введите числа: ");
            int number = scanner.nextInt();

             if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }
            System.out.println("Положительное число: " + number);


        }

    }
}
