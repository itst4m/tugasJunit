
package tugas.nomer2.Lingkaran;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LingkaranTest {
    @Test
    public void testCalculateArea() {
        double radius = 5.0;
        double expected = 78.53981633974483;
        double delta = 0.0001;

        double result = Lingkaran.calculateArea(radius);
        assertEquals(expected, result, delta);
    }
}
