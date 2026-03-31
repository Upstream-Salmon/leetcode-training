package p0001_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionHashMap {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("invalid argments");
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 1. とりあえず取ってみる（Mapへのアクセスはこれだけ）
            Integer index = map.get(complement);

            // 2. null でなければ「存在した」ということ
            if (index != null) {
                return new int[] {index, i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] resultArr = sol.twoSum(new int[] {3, 2, 4}, 6);
        System.out.println(Arrays.toString(resultArr));
    }
}
