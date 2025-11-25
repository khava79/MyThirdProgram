package task5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        FarmAnimal cow = new Cow();
        farm.setAnimal(cow);
        farm.manage();

        FarmAnimal chicken = new Chicken();
        farm.setAnimal(chicken);
        farm.manage();
    }
}
