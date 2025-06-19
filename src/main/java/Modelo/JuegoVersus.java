package Modelo;

import Controlador.ConsolaJuegoVersus;

public class JuegoVersus {

    private final Jugador jugador1 = new Jugador();
    private final Jugador jugador2 = new Jugador();

    private int puntajeJugador1 = 0;
    private int puntajeJugador2 = 0;

    public void ronda(int turnos) {
        for (int i = 1; i <= turnos; i++) {
            System.out.println("===== Ronda " + i + " =====");

            jugador1.jugadorLanzar();
            int resultado1 = jugador1.getResultado();

            jugador2.jugadorLanzar();
            int resultado2 = jugador2.getResultado();

            if(turnos !=1) {
                System.out.println("Turno Jugador 1:");
                System.out.println("Resultado Jugador 1: " + resultado1);

                System.out.println("Turno Jugador 2:");
                System.out.println("Resultado Jugador 2: " + resultado2);

                if (resultado1 > resultado2) {
                    System.out.println("Gana la ronda el Jugador 1");
                } else if (resultado2 > resultado1) {
                    System.out.println("Gana la ronda el Jugador 2");
                } else {
                    System.out.println("Empate en la ronda");
                }
            }
            puntajeJugador1 = jugador1.getResultado();
            puntajeJugador2 = jugador2.getResultado();

            System.out.println();
        }

        mostrarGanadorFinal();
    }

    private void mostrarGanadorFinal() {
        System.out.println("=== Resultado Final ===");
        System.out.println("Puntaje Jugador 1: " + puntajeJugador1);
        System.out.println("Puntaje Jugador 2: " + puntajeJugador2);

        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println("Jugador 1 gana la partida");
        } else if (puntajeJugador2 > puntajeJugador1) {
            System.out.println("Jugador 2 gana la partida");
        } else {
            System.out.println("Empate en la partida");
        }
    }
}
