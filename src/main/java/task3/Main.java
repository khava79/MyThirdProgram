package task3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish steak = new HotDish("Стейк", 75.0);
        menu.setDish(steak);
        menu.printDish();



        Dish juice = new Drink("Яблочный сок", 350);
        menu.setDish(juice);
        menu.printDish();

    }
}
