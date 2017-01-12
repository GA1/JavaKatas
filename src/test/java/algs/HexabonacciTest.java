package algs;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class HexabonacciTest {

    private HexabonacciSolver solver = new HexabonacciSolver();

    @Test
    public void n1() {
        assertEquals(new BigInteger("1"), solver.solve(1));
    }

    @Test
    public void nEqual6() {
        assertEquals(new BigInteger("32"), solver.solve(6));
    }

    @Test
    public void nEqual7() {
        assertEquals(new BigInteger((new Integer(1 + 2 + 4 + 8 + 16 + 32)).toString()), solver.solve(7));
    }

}
