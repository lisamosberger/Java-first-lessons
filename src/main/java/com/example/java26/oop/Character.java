package com.example.java26.oop;

public class Character {
    private int health;
    private int maxHealth;

    public Character(int health, int maxHealth) {
        this.maxHealth = maxHealth;
        if (health < 0 ) {
            this.health = 0;
        }
        else if (health > maxHealth) {
            this.health = maxHealth;
        }
        else {
            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 ) {
            this.health = 0;
        }
        else if (health > maxHealth) {
            this.health = maxHealth;
        }
        else {
            this.health = health;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void takeDamage(int amount) {
        health =  health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal (int amount) {
        health = health + amount;

        if  (health > maxHealth) {
            health = maxHealth;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
