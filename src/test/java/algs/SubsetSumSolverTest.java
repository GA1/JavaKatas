package algs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SubsetSumSolverTest {

    private SubsetSumSolver solver = new SubsetSumSolver();
    private ArrayList<Integer> merged;

    @Test
    public void emptySetWith0Sum() {
        assertTrue(solver.solve(new int[]{}, 0));
    }

    @Test
    public void emptySetWith1Sum() {
        assertFalse(solver.solve(new int[]{}, 1));
    }

    @Test
    public void set1With1Sum() {
        assertTrue(solver.solve(new int[]{1}, 1));
    }

    @Test
    public void set1With2Sum() {
        assertFalse(solver.solve(new int[]{1}, 2));
    }

    @Test
    public void set1_2With3Sum() {
        assertTrue(solver.solve(new int[]{1, 2}, 3));
    }

    @Test
    public void set1_2_3With3Sum() {
        assertTrue(solver.solve(new int[]{1, 2, 3}, 3));
    }

    @Test
    public void set3_2_1With3Sum() {
        assertTrue(solver.solve(new int[]{3, 2, 1}, 3));
    }

    @Test
    public void mergeArrayEmpty() {
        merged = solver.mergeSameNumbers(new int[]{});
        assertEquals(0, merged.size());
    }

    @Test
    public void mergeArray1() {
        merged = solver.mergeSameNumbers(new int[]{1});
        assertEquals(1, merged.size());
        assertEquals(merged.get(0), (Integer)1);
    }

    @Test
    public void mergeArray1_1() {
        merged = solver.mergeSameNumbers(new int[]{1, 1});
        assertEquals(1, merged.size());
        assertEquals(merged.get(0), (Integer)2);
    }

    @Test
    public void mergeArray5_7() {
        merged = solver.mergeSameNumbers(new int[]{5, 7});
        assertEquals(2, merged.size());
        assertEquals(merged.get(0), (Integer)5);
        assertEquals(merged.get(1), (Integer)7);
    }

    @Test
    public void mergeArray5_7_7() {
        merged = solver.mergeSameNumbers(new int[]{5, 7, 7});
        assertEquals(2, merged.size());
        assertEquals(merged.get(0), (Integer)5);
        assertEquals(merged.get(1), (Integer)14);
    }

    @Test
    public void set1_1With2Sum() {
        assertTrue(solver.solve(new int[]{1, 1}, 2));
    }

    @Test
    public void set1_1With1Sum() {
        assertFalse(solver.solve(new int[]{1, 1}, 1));
    }


}
