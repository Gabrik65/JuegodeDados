import Modelo.Dado;
import Modelo.JuegoDados;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoDadosTest {

    private Dado dado1;
    private Dado dado2;
    private JuegoDados juego;

    @BeforeEach
    public void setUp() {
        dado1 = new Dado();
        dado2 = new Dado();
        juego = new JuegoDados();
    }

    @Test
    public void testLanzamientoDadoEnRango() {
        for (int i = 0; i < 100; i++) {
            int valor = dado1.lanzar();
            assertTrue(valor >= 1 && valor <= 6, "El valor del dado debe estar entre 1 y 6");
        }
    }

    @Test
    public void testValorInicialDelDadoEnRango() {
        int valorInicial = dado1.getValor();
        assertTrue(valorInicial >= 1 && valorInicial <= 6, "El valor inicial del dado debe estar entre 1 y 6");
    }

    @Test
    public void testSumaDadosAlJugar() {
        juego.jugar();
        // La suma debe estar entre 2 y 12, dado que se usan dos dados
        int suma = juegoValorDeSuma(juego);
        assertTrue(suma >= 2 && suma <= 12, "La suma de dos dados debe estar entre 2 y 12");
    }

    @Test
    public void testEsGanadorConSiete() {
        assertTrue(juego.esGanador(7), "Debe ganar si la suma es 7");
    }

    @Test
    public void testNoEsGanadorConOtroNumero() {
        assertFalse(juego.esGanador(5), "No debe ganar si la suma no es 7");
        assertFalse(juego.esGanador(11), "No debe ganar si la suma no es 7");
    }

    /**
     * Método auxiliar para obtener la suma usando reflexión,
     * ya que no hay un getter para 'suma' en la clase JuegoDados.
     */
    private int juegoValorDeSuma(JuegoDados juego) {
        try {
            var field = JuegoDados.class.getDeclaredField("suma");
            field.setAccessible(true);
            return (int) field.get(juego);
        } catch (Exception e) {
            fail("No se pudo acceder al campo 'suma'");
            return -1; // por si acaso
        }
    }
}
