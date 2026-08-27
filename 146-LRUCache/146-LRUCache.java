// Last updated: 8/27/2026, 9:12:08 AM
1class Solution {
2    public int thirdMax(int[] nums) {
3        long max = Long.MIN_VALUE;
4        long secondMax = Long.MIN_VALUE;
5        long thirdMax = Long.MIN_VALUE;
6
7        for (int num : nums) {
8            long val = num;
9
10            if (val == max || val == secondMax || val == thirdMax) {
11                continue;
12            }
13
14            if (val > max) {
15                thirdMax = secondMax;
16                secondMax = max;
17                max = val;
18            } else if (val > secondMax) {
19                thirdMax = secondMax;
20                secondMax = val;
21            } else if (val > thirdMax) {
22                thirdMax = val;
23            }
24        }
25
26        return thirdMax == Long.MIN_VALUE ? (int) max : (int) thirdMax;
27    }
28}