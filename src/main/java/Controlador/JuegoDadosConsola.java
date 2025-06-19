package Controlador;

import Modelo.Dado;
import Vista.MenuOpciones;

public class JuegoDadosConsola {
    private final String[] opciones = {"Lanzar Dados", "Mostrar Dados", "Sumar Dados","Salir"};
    private MenuOpciones menuJuegoDados = new MenuOpciones("Juego de Dados",opciones);
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();

    public void menuJuego(){

    }

}
