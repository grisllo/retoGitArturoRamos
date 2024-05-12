package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class Baraja_test {
    @Test
    public void agregar_test(){
        Carta sotaCopas = new Carta("Sota","Copas",11);
        Carta sotaCopas2 = new Carta("Sota","Copas",11);
        Carta seisBastos = new Carta("Seis", "Bastos", 6);

        Baraja miBaraja = new Baraja();

        miBaraja.agregarCarta(sotaCopas);
        miBaraja.agregarCarta(seisBastos);

        assertEquals(sotaCopas.getNombre(), miBaraja.getMiBaraja().get(0).getNombre());
        assertSame(sotaCopas, miBaraja.getMiBaraja().get(0));
        assertEquals(2, miBaraja.numeroCartas());

    }

}
