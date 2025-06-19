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
        juego = new JuegoDados(dado1, dado2);
    }

    @Test
    public void testLanzamientoDadoEnRango() {
        for (int i = 0; i < 100; i++) {
            int valor = dado1.lanzar();
            assertTrue(valor >= 1 && valor <= 6);
        }
    }

    @Test
    public void testSumaDados() {
        int suma = juego.jugar();
        assertTrue(suma >= 2 && suma <= 12);
    }

}
