package p0347_top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionInit {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        keys.sort((a, b) -> Integer.compare(countMap.get(b), countMap.get(a)));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] result = sol.topKFrequent(new int[] {1, 1, 1, 2, 2, 3, 3,}, 2);
        System.out.println(Arrays.toString(result));
    }
}
