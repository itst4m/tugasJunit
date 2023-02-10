
package tugas.nomer3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PenghitungKarakterTest {
    @Test
    public void testCountCharacters() {
        String str = "Hello World 123!@#$%^";
        int expectedUppercase = 2;
        int expectedLowercase = 8;
        int expectedDigits = 3;
        int expectedSpecial = 6;

        int resultUppercase = PenghitungKarakter.countUppercase(str);
        int resultLowercase = PenghitungKarakter.countLowercase(str);
        int resultDigits = PenghitungKarakter.countDigits(str);
        int resultSpecial = PenghitungKarakter.countSpecial(str);

        assertEquals(expectedUppercase, resultUppercase);
        assertEquals(expectedLowercase, resultLowercase);
        assertEquals(expectedDigits, resultDigits);
        assertEquals(expectedSpecial, resultSpecial);
    }
}
