package practice_3;

public class Main8 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов", "Физика");
        teacher.printInfo();

        teacher.setSubject("Литература");
        teacher.printInfo();
    }
}
