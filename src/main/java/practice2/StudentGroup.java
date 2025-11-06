package practice_2;

public class StudentGroup {
    // поля
    String groupName;
    int studentCount;

    // Конструктор
    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    // Геттер для поля groupName
    String getGroupName() {
        return groupName;
    }

    // Геттер для поля studentCount
    int getStudentCount() {
        return studentCount;
    }

    // Сеттер для поля studentCount
    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    // Метод printInfo
    void printInfo() {
        System.out.println("Название группы: " + groupName + ", количество студентов: " + studentCount);
    }

}
