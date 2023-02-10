
package tugas.nomer2.PersegiPanjang;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersegiPanjangTest {
    @Test
    public void testCalculateArea() {
        double length = 5.0;
        double width = 10.0;
        double expected = 50.0;
        double delta = 0.0001;

        double result = PersegiPanjang.calculateArea(length, width);
        assertEquals(expected, result, delta);
    }
}
