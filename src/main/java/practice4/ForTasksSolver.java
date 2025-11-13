package practice4;

public class ForTasksSolver {
    public static void main(String[] args) {

        //System.out.println(sumOfNumbers(10));

        //multiplayTable(5);

        //printAllNumbers();

        //printDivisibleByThree();

        checkPrime(9);
        checkPrime(5);
    }

    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public static void multiplayTable (int number) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void printAllNumbers () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


    }

    public static void printDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    public static void checkPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не простое число");
        }


    }
}
