package com.example.java26.oop;

public class CharacterDemo {
    static void main () {
        Character character = new Character(100, 100);

        while (character.isAlive()) {

            String choice = IO.readln("Do you want to 'damage' the character or 'heal' him?");
            IO.println("Hur mycket?");
            int amount = Integer.parseInt(IO.readln());

            if (choice.equals("damage")) {
                character.takeDamage(amount);
            } else if (choice.equals("heal")) {
                character.heal(amount);
            }


            IO.println("Health: " + character.getHealth());
            IO.println("Alive: " + character.isAlive());
        }

        IO.println("You killed the character!");
    }
}
