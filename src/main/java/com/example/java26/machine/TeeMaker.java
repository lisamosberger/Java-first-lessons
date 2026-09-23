package com.example.java26.machine;

public class TeeMaker extends AbstractBeverageMaker implements BeverageMachine{

    @Override
    public void brew() {
        IO.println("Making Tea");
    }
}
