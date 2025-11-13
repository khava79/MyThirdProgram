package practice4;

public class TaskSolver {
    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */
    public String checkParity(int number) {
        // if - else
        // number % 2 == 0 -> Четное
        // number % 2 == 1 -> Нечетное
        // number = 2; -> 2 % 2 == 0 -> Четное
        // number = 7; -> 2 % 2 == 1 -> Нечетное
        // в методе должен быть один return

        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;



    }

    public String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }

        return ageDescription;
    }


    public int checkMax(int  a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }

        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }

        return max;
    }





}
