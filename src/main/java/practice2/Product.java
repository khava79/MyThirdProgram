package practice_2;

public class Product {
    // поля
    String name;
    double price;

    // Конструктор
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттер для поля name
    String getName() {
        return name;
    }

    // Геттер для поля price
    double getPrice() {
        return price;
    }

    // Сеттер для поля price
    void setPrice(double price) {
        this.price = price;
    }

    // Метод для применения скидки
    void applyDiscount(double discount) {
        price -= price * discount / 100;
    }

    // Метод для вывода информации
    void printInfo() {
        System.out.println("Товар: " + name + ", цена: " + price + " руб.");
    }
}
