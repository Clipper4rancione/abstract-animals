package org.lessons.java;

public class Delfino extends Animale implements INuotante{

    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("DELF DELF!");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("STO NUOTANDO!!");
    }
}
