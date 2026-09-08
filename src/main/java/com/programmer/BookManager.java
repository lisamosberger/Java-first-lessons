package com.programmer;

import java.util.ArrayList;

public class BookManager {
    record Book(String titel, String author, int pages) {}
    static void main (){

        ArrayList<Book> books = new ArrayList<>();

        while (true){

            String titel = IO.readln("Book or press 1 to exit: ");

            if (titel.equals("1")){
                break;
            }
            String author = IO.readln("Author: ");
            int pages = Integer.parseInt(IO.readln("Pages: "));

            Book book = new Book(titel, author, pages);
            books.add(book);

        }
        IO.println("Alla Böker");
        for  (Book book : books) {
            IO.println("Book: " + book.titel);
            IO.println("Author: " + book.author);
            IO.println("Pages: " + book.pages);
            IO.println("==========================");
        }
    }
}
