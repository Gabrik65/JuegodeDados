package Modelo;

/**
 * Clase que representa una partida con dos dados.
 */
public class JuegoDados {
    private final Dado dado1;
    private final Dado dado2;


    public JuegoDados(Dado dado1, Dado dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        int suma = jugar();
    }

    public int jugar() {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        return valor1 + valor2;
    }

    public boolean esGanador(int suma) {
        return suma == 7;
    }

    public void resultadosJuego(int dado1, int dado2){
        System.out.println("Resultados del Juego");
        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);

        System.out.println("Suma: " + dado1 + dado2);
    }
}
