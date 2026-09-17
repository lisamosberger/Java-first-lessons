package com.example.java26.oop;

public class CharacterDemo {
    static void main () {
        Character character = new Character(100, 100);
        boolean hasAttacked = false;

        IO.println("You walk trough a Forest in the dark, suddendly a Stranger passes your way.");
        IO.println("He starts running torwards you, you don't know what's he's gonna do so choose wisely.");
        IO.println("In your bag you have a Sword (100dmg), a fly swatter (10dmg) or you can use your fist (5dmg).");


        while (character.isAlive()) {

            IO.println("");
            IO.println("The Stranger has " + character.getHealth() + " hp.");
            IO.println("What do you want to do?");
            IO.println("1. Sword");
            IO.println("2. Fly swatter");
            IO.println("3. Your fist");
            String choice = IO.readln("Choose number: ");


            if (choice.equals("1")) {
                character.takeDamage(100);
                hasAttacked = true;
            }
            else if (choice.equals("2")) {
                character.takeDamage(10);
                hasAttacked = true;
            }
            else if (choice.equals("3")) {
                character.takeDamage(5);
                hasAttacked = true;
            }
            else {
                IO.println("Invalid choice.");
                continue;
            }


            IO.println("Health: " + character.getHealth());
            IO.println("Alive: " + character.isAlive());

            if (character.isAlive() && hasAttacked) {

                String action = IO.readln("Do you want to hit him again or usw healing magic? " +
                "1. hit again, 2. heal.");

                if (action.equals("2")) {
                    String healAmount = IO.readln("How much health do you want to give him back? ");

                    int amount = Integer.parseInt(healAmount);
                    character.heal(amount);

                    IO.println("The Stranger now has " + character.getHealth() + "health.");

                }
            }


        }

        IO.println("You killed the Stranger!");
    }
}
