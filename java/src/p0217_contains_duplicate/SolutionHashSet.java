package p0217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class SolutionHashSet {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            boolean isDuplicate = !set.add(num);
            if (isDuplicate)
                return true;
        }
        return false;
    }
}
