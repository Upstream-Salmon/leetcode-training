package p0238_product_of_array_exccept_self;

import java.util.Arrays;

public class SolutionInit {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                temp *= nums[j];
            }
            answer[i] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] result = sol.productExceptSelf(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
