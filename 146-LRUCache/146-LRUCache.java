// Last updated: 8/27/2026, 9:16:07 AM
1public class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4        for (int i = 1; i <= n / 2; i++) {
5            if (n % i == 0) {
6                String substring = s.substring(0, i);
7                StringBuilder repeated = new StringBuilder();
8                for (int j = 0; j < n / i; j++) {
9                    repeated.append(substring);
10                }
11                if (repeated.toString().equals(s)) return true;
12            }
13        }
14        return false;
15    }
16}