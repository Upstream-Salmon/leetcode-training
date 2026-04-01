package p0392_is_subsequence;

public class SolutionIndexOf {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() > t.length())
            return false;
        if (s.isEmpty())
            return true;
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            lastIndex = t.indexOf(s.charAt(i), lastIndex + 1);
            if (lastIndex == -1)
                return false;
        }
        return true;
    }
}
