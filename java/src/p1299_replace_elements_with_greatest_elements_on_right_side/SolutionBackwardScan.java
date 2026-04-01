package p1299_replace_elements_with_greatest_elements_on_right_side;

import java.util.Arrays;

public class SolutionBackwardScan {
    public int[] replaceElements(int[] arr) {
        if (arr == null)
            return new int[0];
        if (arr.length == 1)
            return new int[] {-1};
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(temp, rightMax);
        }
        return arr;
    }

    public static void main(String[] args) {
        SolutionBackwardScan sol = new SolutionBackwardScan();
        int[] result = sol.replaceElements(new int[] {17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(result));
    }
}
