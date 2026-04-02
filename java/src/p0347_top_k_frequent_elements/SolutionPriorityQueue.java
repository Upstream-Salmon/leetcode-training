package p0347_top_k_frequent_elements;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SolutionPriorityQueue {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(countMap.get(a), countMap.get(b)));
        for (int num : countMap.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionPriorityQueue sol = new SolutionPriorityQueue();
        int[] result = sol.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
        System.out.println(Arrays.toString(result));
    }
}
