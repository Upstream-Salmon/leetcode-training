package p0217_contains_duplicate;

import java.util.Arrays;

public class SolutionSort {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2)
            return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SolutionSort sol = new SolutionSort();
        boolean result = sol.containsDuplicate(new int[] {1, 2, 3, 4});
        System.out.println(result);
    }
}

