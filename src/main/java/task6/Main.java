package task6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

        Plant orchid = new Orchid();
        garden.setPlant(orchid);
        garden.maintainPlant();

        Plant cactus = new Cactus();
        garden.setPlant(cactus);
        garden.maintainPlant();

    }
}
