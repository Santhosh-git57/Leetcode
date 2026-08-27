// Last updated: 8/27/2026, 9:09:31 AM
1class Solution {
2    public String toHex(int num) {
3        if (num == 0)
4            return "0";
5        StringBuilder sb = new StringBuilder();
6        while (num != 0) {
7            int digit = num & 15;
8            sb.append(calculate(digit));
9            num = num >>> 4;
10        }
11        return sb.reverse().toString();
12    }
13
14    char calculate(int digit) {
15        if (digit == 10)
16            return 'a';
17        else if (digit == 11)
18            return 'b';
19        else if (digit == 12)
20            return 'c';
21        else if (digit == 13)
22            return 'd';
23        else if (digit == 14)
24            return 'e';
25        else if (digit == 15)
26            return 'f';
27        else
28            return (char) ('0' + digit);
29    }
30}