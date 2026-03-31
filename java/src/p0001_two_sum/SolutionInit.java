package p0001_two_sum;

import java.util.Arrays;

public class SolutionInit {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.printf("%d,%d%n", i, j);
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] resultArr = sol.twoSum(new int[] {3, 2, 4}, 6);
        System.out.println(Arrays.toString(resultArr));
    }
}
