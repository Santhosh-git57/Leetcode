// Last updated: 9/7/2026, 8:36:51 PM
1class Solution {
2    public int countSegments(String s) {
3
4        int count = 0;
5
6        for(int i = 0; i < s.length(); i++) {
7
8            if(s.charAt(i) != ' ' &&
9               (i == 0 || s.charAt(i - 1) == ' ')) {
10
11                count++;
12            }
13        }
14
15        return count;
16    }
17}