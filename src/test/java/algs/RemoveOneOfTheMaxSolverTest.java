package algs;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoveOneOfTheMaxSolverTest {


    private RemoveOneOfTheMaxSolver solver = new RemoveOneOfTheMaxSolver();
    private LinkedList<Integer> nums = new LinkedList<Integer>();
    private List<Integer> result = new LinkedList<Integer>();


    @Test
    public void solve1() {
        nums.add(1);
        result = solver.removeOneOfTheMax(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void solve5_7() {
        nums.add(5);
        nums.add(7);
        result = solver.removeOneOfTheMax(nums);
        assertEquals(1, result.size());
        assertEquals(5, (int)result.get(0));
    }

    @Test
    public void solve7_7() {
        nums.add(7);
        nums.add(7);
        result = solver.removeOneOfTheMax(nums);
        assertEquals(1, result.size());
        assertEquals(7, (int)result.get(0));
    }

    @Test
    public void solve7_5_7() {
        nums.add(7);
        nums.add(5);
        nums.add(7);
        result = solver.removeOneOfTheMax(nums);
        assertEquals(2, result.size());
        assertTrue(result.indexOf(5) != -1);
        assertTrue(result.indexOf(7) != -1);
    }

}
