package p0217_contains_duplicate;

public class SolutionInit {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2)
            return false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        boolean result = sol.containsDuplicate(new int[] {1, 2, 3, 1});
        System.out.println(result);
    }
}
