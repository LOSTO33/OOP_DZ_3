package library;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    String title;

    String author;

    int publishedYear;



    Comparator<Book> comparatorTitle = Comparator.comparing(obj -> obj.title);

    Comparator<Book> comparatorAuthor = Comparator.comparing(obj -> obj.author);

    Comparator<Book> comparatorYear = Comparator.comparing(obj -> obj.publishedYear);



    @Override

    public String toString() {

        return "Book{" +"title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear + '}';

    }

    public Book(String title, String author, int publishedYear){

        this.author = author;

        this.title = title;

        this.publishedYear = publishedYear;

    }

    public String getTitle() {

        return title;

    }


    public void setTitle(String title) {

        this.title = title;
    }



    public String getAuthor() {

        return author;
    }



    public void setAuthor(String author) {

        this.author = author;

    }



    public int getPublishedYear() {

        return publishedYear;

    }



    public void setPublishedYear(int publishedYear) {

        this.publishedYear = publishedYear;

    }



    @Override

    public int compareTo(Book book) {

        return title.compareTo(book.getTitle());

    }

}















//public class library.Library.library.Library.library.Book implements Comparable<library.Library.library.Library.library.Book> {
//    String title;
//
//    @Override
//    public String toString() {
//        return "library.Library.library.Library.library.Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", publishedYear=" + publishedYear +
//                '}';
//    }
//    String  author;
//    int publishedYear;
//    public library.Library.library.Library.library.Book(String title, String author, int publishedYear){
//        this.author = author;
//        this.title = title;
//        this.publishedYear = publishedYear;
//    }
//    public String getTitle() {
//
//        return title;
//    }
//
//    public void setTitle(String title) {
//
//        this.title = title;
//    }
//
//    public String getAuthor() {
//
//        return author;
//    }
//
//    public void setAuthor(String author) {
//
//        this.author = author;
//    }
//
//    public int getPublishedYear() {
//
//        return publishedYear;
//    }
//
//    public void setPublishedYear(int publishedYear) {
//
//        this.publishedYear = publishedYear;
//    }
//
//    @Override
//    public int compareTo(library.Library.library.Library.library.Book library.Library.library.Library.library.Book) {
//        return  title.compareTo(library.Library.library.Library.library.Book.getTitle());
//    }
//}
