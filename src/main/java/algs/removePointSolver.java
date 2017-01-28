package algs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class removePointSolver {

    private static final int IRRELEVANT_INTEGER = 13425687;

    public P solve(P[] points) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
//        Point leftBottom = new Point(-1, Integer.MAX_VALUE, Integer.MAX_VALUE);
//        Point topLeftY = new Point(-1, Integer.MAX_VALUE, Integer.MIN_VALUE);
//        Point rightTop = new Point(-1, Integer.MIN_VALUE, Integer.MIN_VALUE);
//        Point bottomRight = new Point(-1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        P leftP = new P(-1, Integer.MAX_VALUE, IRRELEVANT_INTEGER);
        P topP = new P(-1, IRRELEVANT_INTEGER, Integer.MIN_VALUE);
        P rightP = new P(-1, Integer.MIN_VALUE, IRRELEVANT_INTEGER);
        P bottomP = new P(-1, IRRELEVANT_INTEGER, Integer.MAX_VALUE);
        for (P p: points) {
            if (p.x < minX ) {
                minX = p.x;
                leftP = p;
            }
            if (maxX < p.x) {
                maxX = p.x;
                rightP = p;
            }
            if (p.y < minY ) {
                minY = p.y;
                leftP = p;
            }
            if (maxY < p.y) {
                maxY = p.y;
                rightP = p;
            }
        }
        return null;
    }

    public List<P> removePointWithId(List<P> points, int id) {
        return points.stream().filter(p -> p.id == id).collect(Collectors.toList());
    }

    class P {
        int id;
        int x;
        int y;

        public P(int id, int x, int y) {
            assert(id > -1);
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

}

