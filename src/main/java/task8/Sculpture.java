package task8;

public class Sculpture implements Exhibit {
    @Override
    public void describe() {
        System.out.println("Скульптура: художественное произведение.");
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура: нуждается в реставрации и очистке.");
    }
}
