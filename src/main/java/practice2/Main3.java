package practice_2;

public class Main3 {
    public static void main(String[] args) {
        Book book = new Book("Три товарища", "Эрих Мария Ремарк");
        book.printInfo();

        book.setAuthor("Александр Пушкин");
        book.printInfo();
    }
}
