// Last updated: 8/27/2026, 9:04:06 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        
7        int[] freq = new int[26];
8        for (int i = 0; i < s.length(); i++) {
9            freq[s.charAt(i) - 'a']++;
10            freq[t.charAt(i) - 'a']--;
11        }
12        
13        for (int i = 0; i < freq.length; i++) {
14            if (freq[i] != 0) {
15                return false;
16            }
17        }
18        
19        return true;
20    }
21}