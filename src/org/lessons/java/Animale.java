package org.lessons.java;

public abstract class Animale {

    String name;

    public Animale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
