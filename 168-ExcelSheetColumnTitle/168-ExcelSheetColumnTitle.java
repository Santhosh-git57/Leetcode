// Last updated: 8/27/2026, 9:01:45 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder result = new StringBuilder();
4        while (columnNumber > 0) {
5            columnNumber--;
6            result.append((char) (columnNumber % 26 + 'A'));
7            columnNumber /= 26;
8        }
9        return result.reverse().toString();
10    }
11}