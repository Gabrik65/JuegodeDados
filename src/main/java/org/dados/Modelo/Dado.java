import java.util.Random;

/**
 * Clase que simula un dado de 6 caras.
 */
public class Dado {
    private int valorActual;
    private Random random;

    /**
     * Constructor que crea un dado de 6 caras.
     */
    public Dado() {
        random = new Random();
        lanzar(); // inicializa con un valor al azar
    }

    /**
     * Lanza el dado (1 a 6) y actualiza el valor actual.
     * @return el valor obtenido
     */
    public int lanzar() {
        valorActual = random.nextInt(6) + 1;
        return valorActual;
    }

    @Override
    public String toString() {
        return "Dado: " + valorActual;
    }
}
