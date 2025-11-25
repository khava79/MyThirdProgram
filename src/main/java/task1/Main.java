package task1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal elephant = new Elephant();
        zoo.setAnimal(elephant);
        System.out.println("Добавили слона");
        zoo.showAnimal();
        System.out.println();

        Animal bird = new Bird();
        zoo.setAnimal(bird);
        System.out.println("Добавили птицу");
        zoo.showAnimal();
        System.out.println();

    }
}
