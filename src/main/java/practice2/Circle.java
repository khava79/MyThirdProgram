package practice_2;

public class Circle {
    // поля
    double radius;

    // Конструктор
    Circle(double radius) {
        this.radius = radius;
    }

    // Геттер для поля radius
    double getRadius() {
        return radius;
    }

    // Сеттер для поля radius
    void setRadius(double radius) {
        this.radius = radius;
    }

    // Методы для вычислений
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
