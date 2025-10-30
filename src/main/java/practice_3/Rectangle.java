package practice_3;

public class Rectangle {
    // поля
    double width;
    double height;

    // Конструктор с двумя параметрами
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Геттер для поля width
    double getWidth() {
        return width;
    }

    // Сеттер для поля width
    void setWidth(double width) {
        this.width = width;


    }

    // Геттер для поля height
    double getHeight() {
        return height;
    }


    // Метод для вычисления площади
    double calculateArea() {
        return width * height;
    }

    void print() {
        System.out.println("Ширина: " + width + ", высота: " + height);
    }

}
