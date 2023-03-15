package org.lessons.java;

public class Passerotto extends Animale{

    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("CIP CIP!");
    }

    @Override
    public void mangia() {
        System.out.println("Vermicelli");
    }
}
