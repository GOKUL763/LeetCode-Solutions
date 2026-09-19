class Solution {
    public int maxProfit(int[] a) {
        int profit = 0;
        int min = a[0];
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int cost = a[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, a[i]);
        }
        return profit;
    }
}