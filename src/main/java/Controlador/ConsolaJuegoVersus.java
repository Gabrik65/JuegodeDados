package Controlador;

import Modelo.JuegoVersus;

public class ConsolaJuegoVersus {
        private final String[] opciones = {"Una Ronda","Tres Rondas","Cinco Rondas","Volver"};
        private final MenuOpciones menuOpciones = new MenuOpciones("Juego de Dados",opciones);
        private final JuegoVersus juego = new JuegoVersus();

        public void menuJuego(){
            int opcion;
            boolean salir = false;

            do {
                menuOpciones.mostrarOpciones();
                opcion = menuOpciones.obtenerOpcionInt();

                if (opcion == menuOpciones.getCantidadOpciones()) salir = true;
                else ejecutarOpcion(opcion);

            } while (!salir);
        }

        public void ejecutarOpcion(int opcion){
            switch (opcion) {
                case 1 -> juego.ronda(1);
                case 2 -> juego.ronda(3);
                case 3 -> juego.ronda(5);
            }
        }
    }
