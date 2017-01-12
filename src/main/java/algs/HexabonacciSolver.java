package algs;

import java.math.BigInteger;
import java.util.LinkedList;

public class HexabonacciSolver {

    public BigInteger solve(int n) {
        LinkedList<BigInteger> lastSix = new LinkedList<>();
        lastSix.add(new BigInteger("1"));
        lastSix.add(new BigInteger("2"));
        lastSix.add(new BigInteger("4"));
        lastSix.add(new BigInteger("8"));
        lastSix.add(new BigInteger("16"));
        lastSix.add(new BigInteger("32"));
        if (n < 7)
            return lastSix.get(n - 1);
        for (int i = 0; i < n - 6; i++){
            lastSix.add(lastSix.get(0).add(lastSix.get(1).add(lastSix.get(2).add(lastSix.get(3).add(lastSix.get(4).add(lastSix.get(5)))))));
            lastSix.removeFirst();
        }
        return lastSix.get(5);
    }

}
