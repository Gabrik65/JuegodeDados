package Modelo;

import java.util.Random;

/**
 * Clase que simula un dado.
 */
public class Dado {
    private int valorActual;    // Valor obtenido al lanzar el dado
    private Random random;      // Generador de números aleatorios

    public Dado() {
        this.random = new Random();
        valorActual = random.nextInt(6) + 1;
    }

    public int lanzar() {
        valorActual = random.nextInt(6) + 1;
        return valorActual;
    }

    public int getValor() {
        return valorActual;
    }
}
