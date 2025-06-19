package Controlador;

import Modelo.JuegoVersus;

public class ConsolaJuegoVersus {
        private final String[] opciones = {"Una Ronda","Tres Rondas","Cinco Rondas","Salir"};
        private final MenuOpciones menuJuegoDados = new MenuOpciones("Juego de Dados",opciones);
        public JuegoVersus juego = new JuegoVersus();

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
                    juego.ronda(1);
                    break;
                case 2:
                    juego.ronda(3);
                    break;
                case 3:
                    juego.ronda(5);
                    break;
            }
        }
    }
