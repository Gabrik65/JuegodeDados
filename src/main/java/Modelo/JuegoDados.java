package Modelo;

import Vista.JuegoDadosConsola;

/**
 * Clase que representa una partida con dos dados.
 */
public class JuegoDados {
    private final Dado dado1 = new Dado();
    private final Dado dado2 = new Dado();
    private int suma;


    public void jugar() {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        suma = valor1 + valor2;
    }

    public boolean esGanador(int suma) {
        return suma == 7;
    }

    public void resultadosJuego(){
        System.out.println("Resultados del Juego");
        System.out.println("Primer dado: " + dado1.getValor());
        System.out.println("Segundo dado: " + dado2.getValor());

        System.out.println("Suma: " + suma);
        if (esGanador(suma)){
            System.out.println("Jugador Gana");
        }else {
            System.out.println("Jugador Pierde");
        }
        volverAlMenu();
    }
     private void volverAlMenu(){
         JuegoDadosConsola juego = new JuegoDadosConsola();
         juego.menuJuego();
     }
}
