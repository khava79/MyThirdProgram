package practice4;

public class Main {
    public static void main(String[] args) {
        TaskSolver taskSolver = new TaskSolver();
        // проверка метода четности
        System.out.println(taskSolver.checkParity(4));
        System.out.println(taskSolver.checkParity(7));


        // проверка метода определения возраста

        System.out.println(taskSolver.checkAge(4));
        System.out.println(taskSolver.checkAge(21));
        System.out.println(taskSolver.checkAge(71));


        // проверка метода по нахождению max среди 3 чисел
        System.out.println(taskSolver.checkMax(3,7,5));
    }


}
