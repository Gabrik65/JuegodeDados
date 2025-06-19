package Modelo;

public class Jugador {
    private JuegoDados juego = new JuegoDados();
    private int resultado;

    public void jugadorLanzar(){
        juego.jugar();
        resultado = juego.getSuma();
    }

    public int getResultado() {
        return resultado;
    }
}
