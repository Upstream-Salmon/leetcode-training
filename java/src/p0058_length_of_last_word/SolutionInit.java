package p0058_length_of_last_word;

public class SolutionInit {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int strLength = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                strLength++;
            } else {
                if (strLength > 0)
                    return strLength;
            }
        }
        return strLength;
    }

    public static void main(String[] args) {
        SolutionInit sol = new SolutionInit();
        int result = sol.lengthOfLastWord("luffy is still joyboy");
        System.out.println(result);
    }
}
