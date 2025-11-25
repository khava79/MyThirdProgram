package task1;

public class Zoo {
    private Animal animal;
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimal() {
        animal.makeSound();
        animal.move();
    }
}
