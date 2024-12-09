import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolaMundoTest {

    @Test
    public void testSaludar() {
        HolaMundo holaMundo = new HolaMundo();
        String resultado = holaMundo.saludar();
        assertEquals("Hola Mundo", resultado, "El saludo debería ser 'Hola Mundo'");
    }
}