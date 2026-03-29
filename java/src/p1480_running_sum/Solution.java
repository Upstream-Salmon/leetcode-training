package p1480_running_sum;

import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i=0; i<nums.length;i++){
            sum += nums[i];
            arr[i]=sum;
        }
        return arr;
    }
    public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1, 2, 3, 4};
    int[] result = sol.runningSum(nums);
    // 結果を表示
    System.out.print(Arrays.toString(result)); 
}
}