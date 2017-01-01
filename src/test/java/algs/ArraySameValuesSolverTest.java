package algs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ArraySameValuesSolverTest {

    private ArraySameValuesSolver solver = new ArraySameValuesSolver();
    private List<String> empty = new ArrayList();


    @Test
    public void empty() {
        assertTrue(solver.of(empty, empty));
    }

    @Test
    public void emptyVsOneElement() {
        assertFalse(solver.of(empty, Arrays.asList("foo")));
        assertFalse(solver.of(Arrays.asList("foo"), empty));
    }

    @Test
    public void oneElementVsSameElement() {
        assertTrue(solver.of(Arrays.asList("foo"), Arrays.asList("foo")));
    }

    @Test
    public void oneElementVsAnotherElement() {
        assertFalse(solver.of(Arrays.asList("boo"), Arrays.asList("foo")));
    }

    @Test
    public void oneElementVsTwoSameElements() {
        assertFalse(solver.of(Arrays.asList("foo"), Arrays.asList("foo", "foo")));
        assertFalse(solver.of(Arrays.asList("foo", "foo"), Arrays.asList("foo")));
    }

    @Test
    public void threeElementsVsThreeElementsRepeating() {
        assertFalse(solver.of(Arrays.asList("foo", "boo", "boo"), Arrays.asList("foo", "foo", "boo")));
        assertFalse(solver.of(Arrays.asList("foo", "foo", "boo"), Arrays.asList("foo", "boo", "boo")));
    }

    @Test
    public void oneElementVsTwoElements() {
        assertFalse(solver.of(Arrays.asList("boo"), Arrays.asList("foo", "boo")));
        assertFalse(solver.of(Arrays.asList("foo", "boo"), Arrays.asList("foo")));
    }

    @Test
    public void orderShouldNotMatterForTwoElements() {
        assertTrue(solver.of(Arrays.asList("boo", "foo"), Arrays.asList("foo", "boo")));
        assertTrue(solver.of(Arrays.asList("boo", "foo"), Arrays.asList("boo", "foo")));
    }

    @Test
    public void twoElementsVsThreElements() {
        assertFalse(solver.of(Arrays.asList("boo", "foo", "bla"), Arrays.asList("foo", "boo")));
    }

}
