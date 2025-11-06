package practice3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;


    String getBookTitle() {
        return bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }
}
