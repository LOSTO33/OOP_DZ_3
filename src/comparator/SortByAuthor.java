package comparator;

import library.Book;


import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book books1, Book books2){
        return books1.getAuthor().compareTo(books2.getAuthor());
    }
}