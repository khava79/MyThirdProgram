package task1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        
        addAndShowAnimal(zoo, new Elephant(), "слона");
        addAndShowAnimal(zoo, new Bird(), "птицу");
    }
    
    private static void addAndShowAnimal(Zoo zoo, Animal animal, String animalName) {
        zoo.setAnimal(animal);
        System.out.println("Добавили " + animalName);
        zoo.showAnimal();
        System.out.println();
    }
}
