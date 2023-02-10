
package tugas.nomer2.Persegi;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersegiTest {
    @Test
    public void testCalculateArea() {
        double side = 5.0;
        double expected = 25.0;
        double delta = 0.0001;

        double result = Persegi.calculateArea(side);
        assertEquals(expected, result, delta);
    }
}
