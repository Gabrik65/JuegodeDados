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
            int resultado1 = turnoJugador(jugador1);
            int resultado2 = turnoJugador(jugador2);

            if(turnos !=1) {
                turno(resultado1,resultado2);
            }

            puntajeJugador1 += jugador1.getResultado();
            puntajeJugador2 += jugador2.getResultado();

            System.out.println();
        }

        mostrarGanadorFinal();
    }

    private void turno(int resultado1, int resultado2){
        System.out.print("Turno Jugador 1: ");
        System.out.println( resultado1);

        System.out.print("Turno Jugador 2: ");
        System.out.println(resultado2);

        if (resultado1 > resultado2) {
            System.out.println("Gana la ronda el Jugador 1");
        } else if (resultado2 > resultado1) {
            System.out.println("Gana la ronda el Jugador 2");
        } else {
            System.out.println("Empate en la ronda");
        }

    }
    public int turnoJugador(Jugador jugador){
        jugador.jugadorLanzar();
        return jugador.getResultado();
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
