package p0167_two_sum_II;

import java.util.Arrays;

public class SolutionInit {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
            return new int[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            int complement = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (complement == numbers[j])
                    return new int[] {i + 1, j + 1};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] result = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
