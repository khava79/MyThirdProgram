package task3;

public class Drink implements Dish {
    private String name;
    private double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return String.format("Напиток: " + name + " , объём: " + volume);
    }
}
