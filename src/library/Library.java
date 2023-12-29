package library;

import comparator.SortByAuthor;
import comparator.SortByYear;
import library.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Library implements Iterable<Book>{

 ArrayList<Book> books;

 public Library() {

 this.books = new ArrayList<>();

}

 @Override

 public Iterator<Book> iterator() {

 return this.books.iterator();

 }


 public void addBook(Book book){

 books.add(book);

}



 public ArrayList<Book> getBook(){

 return books;

 }
 public void sortByAuthor(){
  Collections.sort(books,new SortByAuthor());
 }
 public void sortByYear(){
  Collections.sort(books,new SortByYear());
 }

}


//public class library.Library.library.Library.library.Book implements Comparable<library.Library.library.Library.library.Book> {
//
// String title;
//
// String author;
//
// int publishedYear;
//
//
//
//Comparator<library.Library.library.Library.library.Book> comparatorTitle = Comparator.comparing(obj -> obj.title);
//
//Comparator<library.Library.library.Library.library.Book> comparatorAuthor = Comparator.comparing(obj -> obj.author);
//
//Comparator<library.Library.library.Library.library.Book> comparatorYear = Comparator.comparing(obj -> obj.publishedYear);
//
//
//
//@Override
//
//public String toString() {
//
//return "library.Library.library.Library.library.Book{" +"title='" + title + '\'' + ", author='" + author + '\'' + ", publishedYear=" + publishedYear + '}';
//
// }
//
// public library.Library.library.Library.library.Book(String title, String author, int publishedYear){
//
// this.author = author;
//
// this.title = title;
//
// this.publishedYear = publishedYear;
//
// }
//
// public String getTitle() {
//
// return title;
//
// }
//
//
//  public void setTitle(String title) {
//
// this.title = title;
//}
//
//
//
//public String getAuthor() {
//
// return author;
// }
//
//
//
// public void setAuthor(String author) {
//
// this.author = author;
//
// }
//
//
//
// public int getPublishedYear() {
//
// return publishedYear;
//
// }
//
//
//
//  public void setPublishedYear(int publishedYear) {
//
// this.publishedYear = publishedYear;
//
// }
//
//
//
// @Override
//
// public int compareTo(library.Library.library.Library.library.Book book) {
//
// return title.compareTo(book.getTitle());
//
// }
//
//}
