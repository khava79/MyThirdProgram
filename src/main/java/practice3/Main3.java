package practice3;

public class Main3 {
    public static void main(String[] args) {
        University student1 = new University(1, "Карл");
        University student2 = new University(2, "Алиса");
        University student3 = new University(3, "Ева");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();


        University.changeUniversityName("MSU");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
