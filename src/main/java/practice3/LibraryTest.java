package practice3;

public class LibraryTest {
    public static void main(String[] args) {
        Library book = new Library();
        book.setBookTitle("Убить пересмешника");
        book.setAuthor("Лермонтов");
        book.setYear(1965);
        book.setCategory("Фэнтези");

        System.out.println(book.getBookTitle() + ", " + book.getAuthor());
        System.out.println(book.getYear() + ", " + book.getCategory());

    }
}
