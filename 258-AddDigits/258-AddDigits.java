// Last updated: 8/22/2026, 9:40:51 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int[] v = new int[n+1];
5        Arrays.fill(v, -1);
6        for(int i = 0; i < nums.length; i++) {
7            v[nums[i]] = nums[i];
8        }
9        for(int i = 0; i < v.length; i++) {
10            if(v[i] == -1) return i;
11        }
12        return 0;
13    }
14}
15