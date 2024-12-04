import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloworldTest {

    @Test
    public void testSaludar() {
        Helloworld holaMundo = new Helloworld();
        String resultado = holaMundo.saludar();
        assertEquals("Hola Mundo", resultado, "El saludo debería ser 'Hola Mundo'");
    }
}
