package practice_3;

public class Main9 {
    public static void main(String[] args) {
        Product product = new Product("Телевизор", 20000);
        product.printInfo();

        product.setPrice(27000);
        product.printInfo();

        product.applyDiscount(25);
        product.printInfo();
    }
}
