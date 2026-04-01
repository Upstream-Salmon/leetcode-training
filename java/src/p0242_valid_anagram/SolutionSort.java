package p0242_valid_anagram;

import java.util.Arrays;

public class SolutionSort {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        SolutionSort sol = new SolutionSort();
        boolean result = sol.isAnagram("rac", "car");
        System.out.println(result);
    }
}
