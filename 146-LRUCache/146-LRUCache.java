// Last updated: 8/27/2026, 9:08:32 AM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        // Intuition: sort both strings and find first mismatch
4        char[] sChars = s.toCharArray();
5        char[] tChars = t.toCharArray();
6        Arrays.sort(sChars);
7        Arrays.sort(tChars);
8
9        int i = 0;
10        while (i < sChars.length && sChars[i] == tChars[i]) {
11            i++;
12        }
13        return tChars[i];
14    }
15}