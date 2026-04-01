package p0242_valid_anagram;

import java.util.Map;
import java.util.HashMap;

public class SolutionHashMap {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int count = countMap.getOrDefault(c, 0);
            if (count == 0)
                return false;
            countMap.put(c, count - 1);
        }
        return true;
    }
}
