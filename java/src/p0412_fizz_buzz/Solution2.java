package p0412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class Solution2 {
    public List<String> fizzBuzz(int n){
        Map <Integer,String> rule = new LinkedHashMap<>();
        rule.put(3,"Fizz");
        rule.put(5, "Buzz");

        List<String> resuList = new ArrayList<>();
        for (int i=1; i<=n; i++){
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<Integer, String> entry :rule.entrySet()){
                if (i % entry.getKey() == 0){
                    sb.append(entry.getValue());
                }
            }

            if(sb.length() == 0){
                sb.append(i);
            }
            resuList.add(sb.toString());
        }
        return resuList;
    }
    public static void main(String [] args){
        Solution2 sol = new Solution2();
        List<String> resultList = sol.fizzBuzz(20);
        System.out.println(resultList);
    }
}
