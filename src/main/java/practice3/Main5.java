package practice3;

public class Main5 {
    public static void main(String[] args) {
        Person p1 = new Person("Коля", "Иванов", "334-33-2222");
        Person p2 = new Person("Маша", "Абрамова", "222-11-9999");

        p1.printPersonInfo();
        p2.printPersonInfo();

        p1.setFirstName("Миша");
        p1.printPersonInfo();

    }
}
