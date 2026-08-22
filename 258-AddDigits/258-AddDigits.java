// Last updated: 8/22/2026, 9:40:17 AM
1class Solution {
2    public boolean isUgly(int n) {
3
4        if (n <= 0) {
5            return false;
6        }
7
8        while (n % 2 == 0) {
9            n /= 2;
10        }
11
12        while (n % 3 == 0) {
13            n /= 3;
14        }
15
16        while (n % 5 == 0) {
17            n /= 5;
18        }
19
20        return n == 1;
21    }
22}