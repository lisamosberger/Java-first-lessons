package com.exercises.looparOchMetoder;

import java.util.ArrayList;

public class Uppgift_11 {
    record Bok (String titel, String författaren, int år){}
    static void main (){

        ArrayList<Bok> books = new ArrayList<>();
        
        while (true){
            String titel = IO.readln("Name a book or 1 to end: ");
            if (titel.equals("1"))
                break;
            String författaren = IO.readln("Name the author: ");
            int år = Integer.parseInt(IO.readln("Which year did it came out? "));
            
            Bok book = new Bok(titel, författaren, år);
            books.add(book);
            
        }
        printAllaBöcker(books);
    }

    private static void printAllaBöcker(ArrayList<Bok> books) {
        IO.println("All books listet");
        IO.println("====================");

        int i = 0;
        for (Bok book : books) {
            i++;
            IO.println(i + ". Book");
            IO.println("Book: " + book.titel);
            IO.println("Author: " + book.författaren);
            IO.println("Time: " + book.år);
        }
        IO.println(books);
    }
}
