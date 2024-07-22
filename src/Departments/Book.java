package Departments;


public class Book {
    private String name;
    private int year;
    private Author author;
    private int kod;

    public Book(Author author, int kod, String name, int year) {
        this.author = author;
        this.kod = kod;
        this.name = name;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
