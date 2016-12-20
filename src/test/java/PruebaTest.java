import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PruebaTest {

    @Test
    public void addTest() {
        assertEquals(5, (new Prueba()).add(2, 3));
    }
}
