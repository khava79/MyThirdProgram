package task4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        
        addAndShowMovement(aquarium, new Shark());
        addAndShowMovement(aquarium, new StarFish());
    }
    
    private static void addAndShowMovement(Aquarium aquarium, SeaCreature creature) {
        aquarium.setCreature(creature);
        aquarium.showMovement();
    }
}
