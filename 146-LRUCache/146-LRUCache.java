// Last updated: 8/27/2026, 9:13:30 AM
1class Solution {
2    public int findMinArrowShots(int[][] segments) {
3        Arrays.sort(segments, (a, b) -> Integer.compare(a[1], b[1]));
4        int ans = 0, arrow = 0;
5        for (int i = 0; i < segments.length; i ++) {
6            if (ans == 0 || segments[i][0] > arrow) {
7                ans ++;
8                arrow = segments[i][1];
9            }
10        }
11        return ans;
12    }
13}