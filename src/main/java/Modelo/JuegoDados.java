package Modelo;

/**
 * Clase que representa una partida con dos dados.
 */
public class JuegoDados {
    private final Dado dado1;
    private final Dado dado2;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        jugar();

    }

    public int[] jugar() {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        return new int[]{valor1, valor2};
    }

    public boolean esGanador(int suma) {
        return suma == 7;
    }
}
