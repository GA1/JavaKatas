package algs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SubAnagramsSolverTest {

    private SubAnagramsSolver solver = new SubAnagramsSolver();
    private List<Integer> result;

    @Test
    public void test_a_a() {
        result = solver.getAnagramIndices("a", "a");
        assertEquals(1, result.size());
    }

    @Test
    public void test_aa_a() {
        result = solver.getAnagramIndices("aa", "a");
        assertEquals(2, result.size());
        assertEquals((Integer)0, result.get(0));
        assertEquals((Integer)1, result.get(1));
    }

    @Test
    public void test___a() {
        result = solver.getAnagramIndices("", "a");
        assertEquals(0, result.size());
    }

    @Test
    public void test_cde__() {
        result = solver.getAnagramIndices("cde", "");
        assertEquals(0, result.size());
    }

    @Test
    public void test_acdeacde_cde() {
        result = solver.getAnagramIndices("acdeacde", "cde");
        assertEquals(2, result.size());
        assertEquals((Integer)1, result.get(0));
        assertEquals((Integer)5, result.get(1));
    }

    @Test
    public void test_abdcghbaabcdij_bcda() {
        result = solver.getAnagramIndices("abdcghbaabcdij", "bcda");
        assertEquals(2, result.size());
        assertEquals((Integer)0, result.get(0));
        assertEquals((Integer)8, result.get(1));
    }

    @Test
    public void test_bbbababaaabbbb_ab() {
        result = solver.getAnagramIndices("bbbababaaabbbb", "ab");
        assertEquals(6, result.size());
    }




}
