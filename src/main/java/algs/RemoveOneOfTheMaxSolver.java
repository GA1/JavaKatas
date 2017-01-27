package algs;

import java.util.Iterator;
import java.util.List;

public class RemoveOneOfTheMaxSolver {

    public List<Integer> removeOneOfTheMax(List<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        Iterator<Integer> it = nums.iterator();
        for (int i = 0; it.hasNext(); i++) {
            Integer temp = it.next();
            if (max < temp) {
                maxIndex = i;
                max = temp;
            }

        }
        nums.remove(maxIndex);
        return nums;
    }
}
