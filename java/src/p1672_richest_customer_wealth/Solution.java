package p1672_richest_customer_wealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int [] account : accounts){
            int sumMoney = 0;
            for (int money : account){
                sumMoney += money;
            }
            maxWealth = Math.max(sumMoney,maxWealth);
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}});
        System.out.println(result);
    }
}
