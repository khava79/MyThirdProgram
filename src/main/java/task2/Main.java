package task2;

public class Main {
    public static void main(String[] args) {
        PetManager manager = new PetManager();
        
        addAndHandle(manager, new Dog());
        addAndHandle(manager, new Cat());
    }
    
    private static void addAndHandle(PetManager manager, Pet pet) {
        manager.setPet(pet);
        manager.handlePet();
        System.out.println();
    }
}
