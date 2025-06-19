package Controlador;

import Modelo.JuegoDados;

import java.util.Scanner;

public class ConsolaJuegoVersus {
        private final String[] opciones = {"Nueva ronda","Salir"};
        private final MenuOpciones menuJuegoDados = new MenuOpciones("Juego de Dados",opciones);
        private final JuegoDados juego = new JuegoDados();

        public void menuJuego(){
            int opcion;
            boolean salir = false;

            do {
                menuJuegoDados.mostrarOpciones();
                opcion = menuJuegoDados.obtenerOpcionInt();
                if (menuJuegoDados.getCantidadOpciones() == opcion){
                    salir = menuJuegoDados.confirmarSalida();
                }
                ejecutarOpcion(opcion);
            } while (opcion != menuJuegoDados.getCantidadOpciones() && salir);
        }

        public void ejecutarOpcion(int opcion){
            switch (opcion){
                case 1:
                    juego.jugar();
                    juego.resultadosJuego();
                    break;
            }
        }

    }
