package p1299_replace_elements_with_greatest_elements_on_right_side;

import java.util.Arrays;

public class SolutionInit {
    public int[] replaceElements(int[] arr) {
        if (arr == null)
            return new int[0];
        if (arr.length == 1)
            return new int[] {-1};
        for (int i = 0; i < arr.length; i++) {
            int rightMax = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (rightMax < arr[j]) {
                    rightMax = arr[j];
                }
            }
            arr[i] = rightMax;
        }
        return arr;

    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int[] result = sol.replaceElements(new int[] {17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(result));
    }
}
