package practice_2;

public class Teacher {
    // поля
    String name;
    String subject;

    // Конструктор
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Геттер для поля name
    String getName() {
        return name;
    }

    // Геттер для поля subject
    String getSubject() {
        return subject;
    }

    // Сеттер для поля name
    void setName(String name) {
        this.name = name;
    }

    // Сеттер для поля subject
    void setSubject(String subject) {
        this.subject = subject;
    }

    // Метод для вывода информации
    void printInfo() {
        System.out.println("Учитель: " + name + ", предмет: " + subject);
    }
}
