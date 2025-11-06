package practice_2;

public class Laptop {
    // поля
    String brand;
    double price;

    // Конструктор
    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Геттер для поля brand
    String getBrand() {
        return brand;
    }

    // Геттер для поля price
    double getPrice() {
        return price;
    }

    // Сеттер для поля brand
    void setBrand(String brand) {
        this.brand = brand;
    }

    // Сеттер для поля price
    void setPrice(double price) {
        this.price = price;
    }

    // Метод для вывода информации
    void printInfo() {
        System.out.println("Ноутбук: " + brand + ", цена: " + price + " руб.");
    }
}
