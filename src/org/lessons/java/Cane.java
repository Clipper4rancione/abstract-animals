package org.lessons.java;

public class Cane extends Animale implements IAnimale{

    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("BAU BAU!");
    }

    @Override
    public void alimentazione() {
        System.out.println("Crocchette");
    }
}
