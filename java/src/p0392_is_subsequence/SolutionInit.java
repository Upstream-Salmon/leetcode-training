package p0392_is_subsequence;

public class SolutionInit {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() > t.length())
            return false;
        if (s.isEmpty())
            return true;
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        boolean result = sol.isSubsequence("abc", "ahbgdc");
        System.out.println(result);
    }
}
