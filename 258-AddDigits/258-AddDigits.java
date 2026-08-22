// Last updated: 8/22/2026, 9:39:57 AM
1class Solution {
2    public int addDigits(int num) {
3        
4        while(num >= 10){
5            int sum = 0;
6
7            while(num > 0){
8                int lastdigit = num % 10;
9                sum += lastdigit;
10                num = num / 10;
11            }
12            num = sum;
13        }
14        
15        return num;
16    }
17}