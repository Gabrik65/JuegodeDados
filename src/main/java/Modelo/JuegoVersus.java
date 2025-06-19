package Modelo;

public class JuegoVersus {

    private final Dado dado1 = new Dado();;
    private final Dado dado2 = new Dado();;
    private final int turnos;

    public JuegoVersus(int turnos) {
        this.turnos = turnos;
    }

    public void ronda(){
        for (int i = 0; i < turnos; i++) {
            dado1.lanzar();

            dado2.lanzar();

        }
    }
}
