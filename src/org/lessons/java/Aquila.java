package org.lessons.java;

public class Aquila extends Animale{

    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("SCREECH!");
    }

    @Override
    public void mangia() {
        System.out.println("Erba, Carne");
    }
}
