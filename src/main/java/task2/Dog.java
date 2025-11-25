package task2;

public class Dog implements Pet {
    @Override
    public void interact() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }
}
