package org.lessons.java;

public class Cane extends Animale{

    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("BAU BAU!");
    }

    @Override
    public void mangia() {
        System.out.println("Crocchette");
    }
}
