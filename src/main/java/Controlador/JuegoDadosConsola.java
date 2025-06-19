package Controlador;

import Modelo.Dado;
import Modelo.JuegoDados;
import Vista.MenuOpciones;

public class JuegoDadosConsola {
    private final String[] opciones = {"Lanzar Dados", "Mostrar Dados", "Sumar Dados","Salir"};
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

    }

}
