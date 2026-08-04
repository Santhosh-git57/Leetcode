# Last updated: 8/4/2026, 9:57:00 AM
1class Solution(object):
2    def mySqrt(self, x):
3        if x == 0:
4            return 0
5        left, right = 1, x
6        while left <= right:
7            mid = (left + right) // 2
8            if mid * mid == x:
9                return mid
10            elif mid * mid < x:
11                left = mid + 1
12            else:
13                right = mid - 1
14        return right