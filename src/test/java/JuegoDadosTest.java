import Modelo.Dado;
import Modelo.JuegoDados;
import Modelo.JuegoVersus;
import Modelo.Jugador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoDadosTest {

    private Dado dado1;
    private JuegoDados juego;
    private JuegoVersus versus;

    @BeforeEach
    public void setUp() {
        dado1 = new Dado();
        juego = new JuegoDados();
        versus = new JuegoVersus();
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

    @Test
    public void testJugadorJversus(){
        Jugador jugador = new Jugador();
        for (int i = 0; i < 100; i++) {
            int valor = versus.turnoJugador(jugador);
            assertTrue(valor >= 2 && valor <= 12, "Suma de Dados debe estar entre 2 y 12");
        }
    }
}
