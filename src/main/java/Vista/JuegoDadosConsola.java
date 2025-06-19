package Vista;

import Controlador.ConsolaJuegoVersus;
import Controlador.MenuOpciones;
import Modelo.JuegoDados;

public class JuegoDadosConsola {
    private final String[] opciones = {"Lanzar Dados","Juego Versus","Salir"};
    private final MenuOpciones menuJuegoDados = new MenuOpciones("Juego de Dados",opciones);
    private final JuegoDados juego = new JuegoDados();
    private final ConsolaJuegoVersus versus = new ConsolaJuegoVersus();

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
            case 2:
                versus.menuJuego();
                break;
        }
    }

}
