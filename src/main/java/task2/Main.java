package task2;

public class Main {
    public static void main(String[] args) {
        PetManager manager = new PetManager();

        Pet dog = new Dog();
        manager.setPet(dog);
        manager.handlePet();
        System.out.println();


        Pet cat = new Cat();
        manager.setPet(cat);
        manager.handlePet();
        System.out.println();


    }
}
