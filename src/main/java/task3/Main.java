package task3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        addAndShowDish(menu, new HotDish("Стейк", 75.0));
        addAndShowDish(menu, new Drink("Яблочный сок", 350));
    }
    
    private static void addAndShowDish(Menu menu, Dish dish) {
        menu.setDish(dish);
        menu.printDish();
    }
}
