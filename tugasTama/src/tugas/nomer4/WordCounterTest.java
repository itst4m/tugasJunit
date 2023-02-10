
package tugas.nomer4;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCounterTest {
    @Test
    public void testWordCounter() {
        String str = "This is a sample string with multiple words";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("this", 1);
        expected.put("is", 1);
        expected.put("a", 1);
        expected.put("sample", 1);
        expected.put("string", 1);
        expected.put("with", 1);
        expected.put("multiple", 1);
        expected.put("words", 1);
        
        int result = WordCounter.countWords(str);
        assertEquals(expected, result);
    }
}
