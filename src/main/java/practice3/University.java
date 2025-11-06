package practice3;

public class University {
    static String universityName = "HSE";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Студент: " + studentName + ", ID: " + studentID + ", Название университета: " + universityName);
    }
}
