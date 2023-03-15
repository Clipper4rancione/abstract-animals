package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        Cane cane = new Cane("Labrador");
        System.out.println("************");
        System.out.println("Ecco i dati del: " + cane.getName());
        cane.dormi();
        cane.mangia();
        cane.verso();

        Aquila aquila = new Aquila("Aquila Reale");
        System.out.println("************");
        System.out.println("Ecco i dati de: " + aquila.getName());
        aquila.dormi();
        aquila.mangia();
        aquila.verso();

        Passerotto passerotto = new Passerotto("Franco il passero");
        System.out.println("************");
        System.out.println("Ecco i dati del: " + passerotto.getName());
        passerotto.dormi();
        passerotto.mangia();
        passerotto.verso();

        Delfino delfino = new Delfino("Delfiny");
        System.out.println("************");
        System.out.println("Ecco i dati del: " + delfino.getName());
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
    }
}
