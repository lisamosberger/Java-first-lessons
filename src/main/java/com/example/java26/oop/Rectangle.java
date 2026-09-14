package com.example.java26.oop;
record Color(int red, int green, int blue) {}
public class Rectangle {
    private int width; //Field
    private int height; //private access, bara coden som befinner sig i klassen kan modifera värderna
    private String color; //#FFA203 färger i code från röd, blå och grön, Reference to anothyer objek, Composition

    public Rectangle(){ //varje nytt objekt börjar med denna värden på
        width = 1;
        height = 1;
    }

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    // för att får de automatisk, tryck höger klick, generate och välja getter och setter
    public int getWidth(){ //declarerad int (returtyp)
        return width;
    }

    // den är inte static eftersom den tillhör en objekt inte klassen
    public void setWidth(int width){ //inte declarerad eftersom den skickar ingenting tillbacks
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
