package practice_2;

public class Main6 {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("БИЯ-212", 23);
        studentGroup.printInfo();


        studentGroup.setStudentCount(15);
        studentGroup.printInfo();
    }
}
