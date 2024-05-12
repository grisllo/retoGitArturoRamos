package org.example;

public class Carta {

    private String nombre, palo;

    private int valor;

    public Carta(String nombre, String palo, int valor) {
        this.nombre = nombre;
        this.palo = palo;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", palo='" + palo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
