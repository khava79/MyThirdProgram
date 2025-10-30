package practice_3;

public class Point {
    // поля
    int x;
    int y;

    // Конструктор
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттер для поля x
    int getX() {
        return x;
    }

    // Геттер для поля y
    int getY() {
        return y;
    }

    // Сеттер для поля x
    void setX(int x) {
        this.x = x;
    }

    // Метод print
    void print() {
        System.out.println("Точка с координатами (" + x + ", " + y +")");
    }
}
