package org.lessons.java;

public abstract class Animale {

    String name;

    // COSTRUTTORE
    public Animale(String name) {
        this.name = name;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ABSTRACT METHODS

    public void dorme(){
        System.out.print("ZzZzZzz");
    }

    public abstract void verso();
    public abstract void alimentazione();

}
