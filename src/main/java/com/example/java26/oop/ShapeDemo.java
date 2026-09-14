package com.example.java26.oop;

public class ShapeDemo {
    static void main (){
        Rectangle rectangle = new Rectangle(); // det gör att ett objekt skapas i minnet som lagar allt som finns i classen Rectangle
                                               // , innan finns ingenting

        rectangle.setHeight(5); //sätter ett värde på variabeln,
        IO.println(rectangle.getHeight());

        Rectangle rectangle2 = new Rectangle(10, 10);
        Rectangle rectangle3 = new Rectangle(100, 100);


    }
}
