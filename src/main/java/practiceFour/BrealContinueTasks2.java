package practiceFour;

import java.util.Scanner;

public class BrealContinueTasks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строки. Для завершения введите 'stop'");
        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
        }
        System.out.println("Программа завершена.");


    }
}
