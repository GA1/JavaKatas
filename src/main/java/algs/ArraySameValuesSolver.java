package algs;

import java.util.*;

public class ArraySameValuesSolver {

    public boolean of(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size())
            return false;
        Map<String, Integer> occ = new HashMap<>();
        list1.stream().forEach(s -> addOrIncrementOccurences(occ, s));
        for (String s: list2) {
            decrementOccurences(occ, s);
            if (occ.get(s) < 0)
                return false;
        }
        return true;
    }

    private void addOrIncrementOccurences(Map<String, Integer> occ, String s) {
        if (!occ.containsKey(s))
            occ.put(s, 1);
        else
            occ.put(s, occ.get(s) + 1);
    }

    private void decrementOccurences(Map<String, Integer> occ, String s) {
        if (!occ.containsKey(s))
            occ.put(s, -1);
        else
            occ.put(s, occ.get(s) - 1);
    }


    // Java 1.7
    public boolean of2(List<String> a1, List<String> a2) {
        if (a1.size() != a2.size())
            return false;
        Set<String> valuesInA1 = new HashSet(a1);
        for (String s: a2)
            if (!valuesInA1.contains(s))
                return false;
        return true;
    }
}
