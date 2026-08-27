// Last updated: 8/27/2026, 9:07:56 AM
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        if (nums.length == 0) return 0;
4        
5        int n = nums.length;
6        if (n < 2) return n;
7        
8        int up = 1, down = 1;
9        
10        for (int i = 1; i < n; ++i) {
11            if (nums[i] > nums[i - 1]) {
12                up = down + 1;
13            } else if (nums[i] < nums[i - 1]) {
14                down = up + 1;
15            }
16        }
17        
18        return Math.max(up, down);
19    }
20    
21    
22}