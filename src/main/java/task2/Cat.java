package task2;

public class Cat implements Pet {
    @Override
    public void interact() {
        System.out.println("Кошка играет");
    }

    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }
 }
