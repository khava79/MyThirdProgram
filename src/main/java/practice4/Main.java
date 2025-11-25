package practice4;

public class Main {
    public static void main(String[] args) {
        TaskSolver1 taskSolver1 = new TaskSolver1();
        System.out.println(taskSolver1.checkSign(7));
        System.out.println(taskSolver1.checkSign(-10));
        System.out.println(taskSolver1.checkSign(0));


        System.out.println(taskSolver1.checkMax(6,9));

        System.out.println(taskSolver1.gradeDescription(5));
        System.out.println(taskSolver1.gradeDescription(3));
        System.out.println(taskSolver1.gradeDescription(9));

        System.out.println(taskSolver1.checkParity(7));
        System.out.println(taskSolver1.checkParity(8));
        System.out.println(taskSolver1.checkParity(232));

        System.out.println(taskSolver1.discountAge(79));
        System.out.println(taskSolver1.discountAge(16));
        System.out.println(taskSolver1.discountAge(33));

        System.out.println(taskSolver1.testGrade(75));
        System.out.println(taskSolver1.testGrade(98));
        System.out.println(taskSolver1.testGrade(45));

        System.out.println(taskSolver1.dayOfWeek(4));
        System.out.println(taskSolver1.dayOfWeek(7));
        System.out.println(taskSolver1.dayOfWeek(11));

        System.out.println(taskSolver1.ticketPrice(3));
        System.out.println(taskSolver1.ticketPrice(6));
        System.out.println(taskSolver1.ticketPrice(12));

        System.out.println(taskSolver1.letterGrade(64));
        System.out.println(taskSolver1.letterGrade(92));
        System.out.println(taskSolver1.letterGrade(74));

        System.out.println(taskSolver1.commandProcess("stop"));
        System.out.println(taskSolver1.commandProcess("restart"));
        System.out.println(taskSolver1.commandProcess("save"));


        System.out.println(taskSolver1.simpleCalculator(8, 9, '-'));
        System.out.println(taskSolver1.simpleCalculator(23, 33, '*'));
        System.out.println(taskSolver1.simpleCalculator(65, 0, '/'));
    }
}
