package task3;

public class HotDish implements Dish {
    private String name;
    private double temperature;

    public HotDish(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return String.format("Горячее блюдо: " + name + " , температура: " + temperature);
    }
}
