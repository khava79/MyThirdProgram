package task4;

public class Aquarium {
    private SeaCreature creature;
    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showMovement() {
        creature.move();
    }
}
