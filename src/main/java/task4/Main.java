package task4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();
        aquarium.setCreature(shark);
        aquarium.showMovement();

        SeaCreature starfish = new StarFish();
        aquarium.setCreature(starfish);
        aquarium.showMovement();
    }
}
