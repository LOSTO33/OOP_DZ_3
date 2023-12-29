import library.Book;
import library.Library;

public class Main {
    public static void main(String[] args) {

        Library books = new Library();
        Book book = new Book("Test", "Ivanov", 1990);
        Book book2 = new Book("Test2", "Sidorov", 1999);
        Book book3 = new Book("sEMENOV", "Petrov", 2005);

        books.addBook(book);
        books.addBook(book2);
        books.addBook(book3);

        System.out.println(books);
        for (Book item : books) {
            System.out.println(item);
        }
        System.out.println();
        books.sortByAuthor();
        for (Book item : books) {
            System.out.println(item);
    }
}
}
