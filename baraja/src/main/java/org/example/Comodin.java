package org.example;

public class Comodin extends Carta {

    private int modificador;

    public Comodin(String nombre, int valor, int modificador) {
        super(nombre, valor);
        this.modificador = modificador;
    }

}
