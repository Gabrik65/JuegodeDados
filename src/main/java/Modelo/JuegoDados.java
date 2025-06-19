package Modelo;

/**
 * Clase que representa una partida con dos dados.
 */
public class JuegoDados {
    private final Dado dado1 = new Dado();
    private final Dado dado2 = new Dado();
    private int suma;

    public JuegoDados(Dado dado1, Dado dado2) {
        int[] valores = jugar();
        suma = suma(valores);
    }

    public int[] jugar() {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        return new int[]{valor1, valor2};
    }

    public int suma(int[] valores){
    return valores[0]+valores[1];
    }
    public boolean esGanador(int suma) {
        return suma == 7;
    }

    public void mostrarDados(int dado1, int dado2){
        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);
    }
    public void resultadosJuego(int dado1, int dado2, int suma){
        System.out.println("Resultados del Juego");
        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);

        System.out.println("Suma: " + dado1 + dado2);
        if (esGanador(suma)){
            System.out.println("Juegador Gana");
        }else {
            System.out.println("Juegador Pierde");
        }
    }
}
