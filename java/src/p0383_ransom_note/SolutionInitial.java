package p0383_ransom_note;

public class SolutionInitial {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] counts = new int[26];
        for (char c : magazine.toCharArray()) {
            int alphabetIndex = c - 'a';
            counts[alphabetIndex]++;
        }
        for (char c : ransomNote.toCharArray()) {
            int alphabetIndex = c - 'a';
            if (counts[alphabetIndex] == 0)
                return false;
            counts[alphabetIndex]--;
        }
        return true;
    }

    public static void main(String[] args) {
        SolutionInitial sol = new SolutionInitial();
        boolean result = sol.canConstruct("yama", "dayama");
        System.out.println(result);
    }
}
