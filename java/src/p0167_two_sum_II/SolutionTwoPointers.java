package p0167_two_sum_II;

import java.util.Arrays;

public class SolutionTwoPointers {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
            return new int[0];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target)
                return new int[] {i + 1, j + 1};
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        SolutionTwoPointers sol = new SolutionTwoPointers();
        int[] result = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

}
