package task6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();
        
        addAndMaintain(garden, new Orchid());
        addAndMaintain(garden, new Cactus());
    }
    
    private static void addAndMaintain(BotanicalGarden garden, Plant plant) {
        garden.setPlant(plant);
        garden.maintainPlant();
    }
}
