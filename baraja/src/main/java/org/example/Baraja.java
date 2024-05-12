package org.example;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> miBaraja;

    public Baraja() {
        this.miBaraja = new ArrayList<Carta>();
    }

    public void agregarCarta(Carta item){
        miBaraja.add(item);
    }

    public int numeroCartas(){
        return miBaraja.size();
    }

    public ArrayList<Carta> getMiBaraja() {
        return miBaraja;
    }

    public void setMiBaraja(ArrayList<Carta> miBaraja) {
        this.miBaraja = miBaraja;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "miBaraja=" + miBaraja +
                '}';
    }
}
