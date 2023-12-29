package comparator;

import library.Book;

import java.util.Comparator;

public class SortByYear implements Comparator<Book> {


    @Override
    public int compare(Book books1, Book books2) {
        if (books1.getPublishedYear()< books2.getPublishedYear()){
            return -1;
        }
        if (books1.getPublishedYear() == books2.getPublishedYear()){
            return 0;
        }
        return 1;
    }
}
