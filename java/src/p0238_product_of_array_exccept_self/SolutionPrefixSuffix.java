package p0238_product_of_array_exccept_self;

import java.util.Arrays;

public class SolutionPrefixSuffix {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionPrefixSuffix sol = new SolutionPrefixSuffix();
        int[] result = sol.productExceptSelf(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
