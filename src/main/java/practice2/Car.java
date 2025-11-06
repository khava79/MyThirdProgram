package practice_2;

public class Car {
    // поля
    String brand;
    int year;

    // Конструктор с двумя параметрами
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Геттер для поля brand
    String getBrand() {
        return brand;
    }

    // Сеттер для поля brand
    void setBrand(String brand) {
        this.brand = brand;
    }

    // Геттер для поля year
    int getYear() {
        return year;
    }

    // Сеттер для поля year
    void setYear(int year) {
        this.year = year;
    }

    void print() {
        System.out.println("Марка: " + brand + ", год выпуска: " + year);
    }
}
