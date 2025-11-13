package practice4;

public class WhileTaskSolver {
    public static void main(String[] args) {
        factorial(9);
        printEvenNumber(97);
        countDown(30);


    }
    // задачка вычисление факториала
    public static void factorial (int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("Факториал числа " + n + " = " + result);

    }

    // задачка на вывод всех четных чисел до заданного числа
    public static void printEvenNumber (int n) {
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Четные числа от 1 до " + n + ":");
    }

    // задачка на обратный отсчет от введенного числа до 1

    public static void countDown (int number) {
        System.out.println("Обратный отсчет от: " + number + ":");
        while (number >= 1) {
            System.out.println(number);
            number--;
        }

    }
}
