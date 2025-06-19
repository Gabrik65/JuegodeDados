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
            assertTrue(valor >= 1 && valor <= 6, "Dado debe estar entre 1 y 6");
        }
    }


    @Test
    public void testEsGanadorConSiete() {
        assertTrue(juego.esGanador(7), "Gana si la suma es 7");
    }

    @Test
    public void testNoEsGanadorConOtroNumero() {
        assertFalse(juego.esGanador(5), "Pierde si la suma no es 7");
        assertFalse(juego.esGanador(11), "Pierde si la suma no es no es 7");
    }

}
