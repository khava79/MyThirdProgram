package practice4;

public class WhileTasks {
    public static void main(String[] args) {
        //factorial(5);
        //printEvenNumber(44);
        //countDown(15);



    }

    public static void factorial (int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Факториал числа " + n + " = " + result);
    }

    public static void printEvenNumber (int n) {
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Четные числа от 1 до " + n + ":");
    }

    public static void countDown (int number) {
        System.out.println("Обратный отсчет от: " + number + ":");
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }


}
