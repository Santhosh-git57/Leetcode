// Last updated: 8/27/2026, 9:07:10 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
4    }
5}