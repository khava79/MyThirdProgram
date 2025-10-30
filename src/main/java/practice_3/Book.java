package practice_3;

public class Book {
    // поля
    String title;
    String author;

    // Конструктор
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттер для поля title
    String getTitle() {
        return title;
    }

    // Сеттер для поля title
    void setTitle(String title) {
        this.title = title;
    }


    // Геттер для поля author
    String getAuthor() {
        return author;
    }

    // Сеттер для поля author
    void setAuthor(String author) {
        this.author = author;
    }

    // Метод printInfo
    void printInfo() {
        System.out.println("Название: " + title + ", автор: " + author);
    }
}
