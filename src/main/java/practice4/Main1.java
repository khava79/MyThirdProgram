package practice4;

import java.awt.*;

public class Main1 {
    public static void main(String[] args) {
        SignChek signChek = new SignChek();
        System.out.println(signChek.chekSign(6));
        System.out.println(signChek.chekSign(-2));
        System.out.println(signChek.chekSign(0));


        System.out.println(signChek.checkMax(7,9));

        System.out.println(signChek.gradeDescription(3));
        System.out.println(signChek.gradeDescription(5));
        System.out.println(signChek.gradeDescription(7));

        System.out.println(signChek.chekParity(4));
        System.out.println(signChek.chekParity(9));

        System.out.println(signChek.discountAge(33));
        System.out.println(signChek.discountAge(15));
        System.out.println(signChek.discountAge(67));

        System.out.println(signChek.testGrade(97));
        System.out.println(signChek.testGrade(89));
        System.out.println(signChek.testGrade(65));
        System.out.println(signChek.testGrade(34));


        System.out.println(signChek.dayOfWeek(5));
        System.out.println(signChek.dayOfWeek(9));

        System.out.println(signChek.ticketPrice(4));
        System.out.println(signChek.ticketPrice(7));
        System.out.println(signChek.ticketPrice(11));

        System.out.println(signChek.letterGrade(82));
        System.out.println(signChek.letterGrade(34));
        System.out.println(signChek.letterGrade(98));


        System.out.println(signChek.commandProcess("start"));
        System.out.println(signChek.commandProcess("status"));
        System.out.println(signChek.commandProcess("save"));

        System.out.println(signChek.simpleCalculator(6,7, '+'));
        System.out.println(signChek.simpleCalculator(346,99, '-'));
        System.out.println(signChek.simpleCalculator(98,12, '*'));
        System.out.println(signChek.simpleCalculator(457,89, '/'));


    }
}
