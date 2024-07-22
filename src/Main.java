
import Departments.Author;
import Departments.Book;
import PizzaMenedgment.LaFeints;
import PizzaMenedgment.Margaret;
import PizzaMenedgment.Pepperoni;
import PizzaMenedgment.PizzaSnackBar;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джеки Чан");
        Book book = new Book(author, 123, "Учебник по программированию для чайников", 2024);
        Book book1 = new Book(author, 111, "djf", 2024);
        Book book2 = new Book(author, 222, "asdfasdf", 2024);
        Library library = new Library();
        library.addBookInArtistic(book);
        library.addBookInLegal(book1);
        library.addBookInTeh(book2);
        library.printAllBookInDepartments();
        library.bookSearchInAuthor(author);

        System.out.println();
        Pepperoni pepperoni = new Pepperoni(30, 1);
        Margaret margaret = new Margaret(20, 0.5);
        LaFeints laFeints = new LaFeints(40, 0.7);
        PizzaSnackBar pizzaSnackBar = new PizzaSnackBar();
        pizzaSnackBar.orderPeperoni(pepperoni, true);
        pizzaSnackBar.orderMargaret(margaret, false);
        pizzaSnackBar.orderLaFeints(laFeints, true);
    }
}