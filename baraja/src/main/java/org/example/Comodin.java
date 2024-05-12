package org.example;

public class Comodin extends Carta {

    private int modificador;

    public Comodin(String nombre, String palo, int valor, int modificador) {
        super(nombre, palo, valor);
        this.modificador = modificador;
    }

}
