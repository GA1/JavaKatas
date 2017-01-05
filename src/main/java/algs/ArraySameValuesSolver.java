package algs;

import java.util.*;

public class ArraySameValuesSolver {

    public boolean of(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size())
            return false;
        Map<String, Integer> occ = new HashMap<>();
        list1.stream().forEach(s -> addOrIncrementOccurences(occ, s));
        for (String s: list2) {
            decrementOccurrences(occ, s);
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

    private void decrementOccurrences(Map<String, Integer> occ, String s) {
        if (!occ.containsKey(s))
            occ.put(s, -1);
        else
            occ.put(s, occ.get(s) - 1);
    }

}
