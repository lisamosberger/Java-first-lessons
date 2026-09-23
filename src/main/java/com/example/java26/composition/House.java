package com.example.java26.composition;

public class House {
    //Composition, Prefer if possible over inheritance
    Room room1 = new Room();
    Room room2 = new Room();
    Kitchen kitchen1 = new Kitchen();
    Bathroom bathroom1 = new Bathroom();

    public void makeAMeal(){
        kitchen1.cook();
    }
}

class Room {

}

class Kitchen {
    public void cook(){

    }
}

class Bathroom {

}
