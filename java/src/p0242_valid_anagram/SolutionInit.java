package p0242_valid_anagram;

public class SolutionInit {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            charCounts[idx]--;
            if (charCounts[idx] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        boolean result = sol.isAnagram("rat", "car");
        System.out.println(result);
    }
}
