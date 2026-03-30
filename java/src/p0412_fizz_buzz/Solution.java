package p0412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> resuList = new ArrayList<>();
        for (int i=1;i<=n; i++){
            if(i%3==0 && i%5==0){
                resuList.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                resuList.add("Fizz");
                continue;
            }
            if(i%5==0){
                resuList.add("Buzz");
                continue;
            }
            resuList.add(Integer.toString(i));
        } 
        return resuList;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> fizzBuzzList = sol.fizzBuzz(5);
        System.out.println(fizzBuzzList);
    }
}
