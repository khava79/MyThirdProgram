package practice4;

public class TaskSolver1 {
    // задачи на if-else
    public String checkSign(int number) {
        String signDescription = "";
        if (number > 0) {
            signDescription = "Число положительное";
        } else if (number < 0) {
            signDescription = "Число отрицательное";
        } else {
            signDescription = "Число равно нулю";
        }

        return signDescription;
    }

    public int checkMax(int a, int b) {
        int max = b;
        if (a > b) {
            max = a;
        }
        return max;

    }

    public String gradeDescription(int grade) {
        String gradeDescription = "";
        switch (grade) {
            case 5:
                gradeDescription = "Отлично";
                break;
            case 4:
                gradeDescription = "Хорошо";
                break;
            case 3:
                gradeDescription = "Удовлетворительно";
                break;
            case 2:
            case 1:
                gradeDescription = "Неудовлетворительно";
                break;
            default:
                gradeDescription = "Несуществующая оценка";

        }
        return gradeDescription;
    }

    public String checkParity (int number) {
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public String discountAge(int age) {
        String discount = "";
        if (age < 18) {
            discount = "Скидка 25%";
        } else if (age >= 65) {
            discount = "Скидка 30%";
        } else {
            discount = "Скидки нет";
        }
        return discount;
    }

    public String testGrade(int score) {
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "Отлично";
        } else if (score >= 75 && score <= 89) {
            grade = "Хорошо";
        } else  if (score >= 60 && score <= 74) {
            grade = "Удовлетворительно";
        } else if (score >= 0 && score <= 60) {
            grade = "Неудовлетворительно";
        }
        return grade;
    }

    // Задачи на switch

    public String dayOfWeek(int day) {
        String printDay = "";
        switch (day) {
            case 1:
                printDay = "Понедельник";
                break;
            case 2:
                printDay = "Вторник";
                break;
            case 3:
                printDay = "Среда";
                break;
            case 4:
                printDay = "Четверг";
                break;
            case 5:
                printDay = "Пятница";
                break;
            case 6:
                printDay = "Суббота";
                break;
            case 7:
                printDay = "Воскресенье";
                break;
            default:
                printDay = "Несуществующий день";
        }
        return printDay;
    }

    public String ticketPrice (int day) {
        String ticket = "";
        switch (day) {
            case 1, 2, 3, 4, 5:
                ticket = "300 рублей";
                break;
            case 6, 7:
                ticket = "450 рублей";
                break;
            default:
                ticket = "Несуществующий день";
        }
        return ticket;
    }

    public String letterGrade (int score) {
        String letter = "";
        switch (score / 10) {
            case 10, 9:
                letter = "A";
                break;
            case 8:
                letter = "B";
                break;
            case 7:
                letter = "C";
                break;
            case 6:
                letter = "D";
                break;
            default:
                if (score >= 0)
                    letter = "F";
                else
                    letter = "Несуществующая оценка";
                break;
        }
        return letter;
    }

    public String commandProcess (String command){
        String message = "";
        switch (command) {
            case "start":
                message = "Система запущена";
                break;
            case "stop":
                message = "Система приостановлена";
                break;
            case "restart":
                message = "Система перезапущена";
                break;
            case "status":
                message = "Статус системы";
                break;
            default:
                message = "Неизвестная команда";

        }
        return message;

    }

    public double simpleCalculator(double a, double b, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Ошибка: деление на ноль");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Неверный оператор");
                return Double.NaN;

        }
        return result;

    }
}

