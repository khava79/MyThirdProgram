package task5;

public class Farm {
    private FarmAnimal animal;
    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void manage() {
        animal.care();
        animal.feed();
        animal.produce();
    }
}
