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

            if (opcion == menuJuegoDados.getCantidadOpciones()) {
                salir = menuJuegoDados.confirmarSalida();
            } else {
                ejecutarOpcion(opcion);
            }

        } while (!salir);
    }

    public void ejecutarOpcion(int opcion){
        if (opcion == 1) {
            juego.jugar();
            juego.resultadosJuego();
        }else if(opcion == 2){
            versus.menuJuego();
        }
    }

}
