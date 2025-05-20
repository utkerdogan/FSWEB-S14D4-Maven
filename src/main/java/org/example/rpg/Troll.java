package org.example.rpg;

public class Troll extends Monster{

    public Troll(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
    
}
