package Departments;

public abstract class Departments {
    public Departments(Book book) {
        this.book = book;
    }

    public Departments() {
    }

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
