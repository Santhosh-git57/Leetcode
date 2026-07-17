// Last updated: 7/17/2026, 3:03:00 PM
class Solution {
    int mod = 1000000007;

    public int zigZagArrays(int a, int b, int c) {
        int n = a;
        int l = b;
        int r = c;
        int m = r - l + 1;

        // dp layers: current pos and next pos
        int[][] cur = new int[m][2];
        int[][] next = new int[m][2];

        // base case: pos == n → 1
        for (int i = 0; i < m; i++) {
            next[i][0] = 1;
            next[i][1] = 1;
        }

        for (int pos = n - 1; pos >= 0; pos--) {
            // slope == 0: go right-to-left (depends on num+1 in same row)
            for (int num = r; num >= l; num--) {
                int idx = num - l;
                int way1 = (num - 1 >= l) ? next[(num - 1) - l][1] : 0; // pos+1
                int way2 = (num + 1 <= r) ? cur[(num + 1) - l][0] : 0; // same pos
                cur[idx][0] = (way1 + way2) % mod;
            }
            // slope == 1: go left-to-right (depends on num-1 in same row)
            for (int num = l; num <= r; num++) {
                int idx = num - l;
                int way1 = (num + 1 <= r) ? next[(num + 1) - l][0] : 0; // pos+1
                int way2 = (num - 1 >= l) ? cur[(num - 1) - l][1] : 0; // same pos
                cur[idx][1] = (way1 + way2) % mod;
            }
            // swap layers
            int[][] temp = next;
            next = cur;
            cur = temp;
        }

        int res = next[r - l][1]; // corresponds to helper(0, r, 1)
        return (res + res) % mod;
    }
}