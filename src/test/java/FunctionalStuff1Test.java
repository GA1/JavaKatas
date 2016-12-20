import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FunctionalStuff1Test {

    private FunctionalStuff1 testSubject = new FunctionalStuff1();

    private List<String> result;

    @Test
    public void noOddLengthWords() {
        result = testSubject.removeWordWithOddLength(Arrays.asList("a"));
        assertEquals(0, result.size());
    }

    @Test
    public void oneOddLengthWord() {
        result = testSubject.removeWordWithOddLength(Arrays.asList("a", "bb", "ccc"));
        assertTrue(result.contains("bb"));
        assertEquals(1, result.size());
    }

    @Test
    public void toUpperCaseForALetter() {
        result = testSubject.toUpperCase(Arrays.asList("a"));
        assertTrue(result.contains("A"));
        assertEquals(1, result.size());
    }

    @Test
    public void toUpperCaseForTwoWords() {
        result = testSubject.toUpperCase(Arrays.asList("aAa", "Bbb"));
        assertTrue(result.contains("AAA"));
        assertTrue(result.contains("BBB"));
        assertEquals(2, result.size());
    }



}
