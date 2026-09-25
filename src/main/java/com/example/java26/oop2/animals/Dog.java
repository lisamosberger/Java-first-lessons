package com.example.java26.oop2.animals;

public class Dog extends Mammal implements Pet {
    @Override
    public void makeSound(){
        IO.println("Woof!");
    }

    @Override
    public boolean isCute() {
        return true;
    }
}
