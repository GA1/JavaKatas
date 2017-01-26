package algs;


import java.util.*;

public class SubsetSumSolver {

    public boolean solve(int[] nums, int target) {
        return solve(0, 0, target, mergeSameNumbers(nums));
    }

    private boolean solve(int start, int tempSum, int sum, ArrayList<Integer> nums) {
        if (start == nums.size())
            return sum == tempSum;
        return solve(start + 1, tempSum + nums.get(start),sum, nums) || solve(start + 1, tempSum, sum, nums);
    }

    ArrayList<Integer> mergeSameNumbers(int[] nums) {
        if (nums.length == 0)
            return toArrayList(nums);
        LinkedList<Integer> merged = new LinkedList<>();
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                tempSum += nums[i];
            else {
                merged.add(tempSum);
                tempSum = nums[i];
            }
        }
        merged.add(tempSum);
        return new ArrayList(merged);
    }

    private ArrayList<Integer> toArrayList(int[] nums) {
        ArrayList<Integer> result = new ArrayList();
        for (int index = 0; index < nums.length; index++)
            result.add(nums[index]);
        return result;
    }

}
