package algs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubAnagramsSolver
{
    public List<Integer> getAnagramIndices(String haystack, String needle)
    {
        List<Integer> result = new ArrayList<>();
        if (needle.length() == 0)
            return result;
        String sortedNeedle = sort(needle);
        int N = haystack.length();
        int K = needle.length();
        for (int i = 0; i < N - K + 1; i++) {
            String subString = haystack.substring(i, i + K);
            String sortedSubStirng = sort(subString);
            if (sortedSubStirng.equals(sortedNeedle))
                result.add(i);
        }
        return result;
    }

    private static String sort(String s ) {
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }
}