# Last updated: 7/17/2026, 3:02:52 PM
class Solution:
    def maximumSum(self, nums: List[int], m: int, l: int, r: int) -> int:
        n = len(nums)

        pref = [0] * (n + 1)
        for i, x in enumerate(nums):
            pref[i + 1] = pref[i] + x

        NEG = -10**30

        def solve(penalty: int):
            dpv = [NEG] * (n + 1)
            dpc = [0] * (n + 1)
            dq = deque()

            for i in range(1, n + 1):
                j = i - l
                if j >= 0:
                    basev, basec = max((dpv[j], dpc[j]), (0, 0))
                    keyv = basev - pref[j]
                    keyc = basec

                    while dq and (dq[-1][0], dq[-1][1]) <= (keyv, keyc):
                        dq.pop()
                    dq.append((keyv, keyc, j))

                while dq and dq[0][2] < i - r:
                    dq.popleft()

                bestv, bestc = dpv[i - 1], dpc[i - 1]

                if dq:
                    keyv, keyc, _ = dq[0]
                    candv = keyv + pref[i] - penalty
                    candc = keyc + 1
                    if (candv, candc) > (bestv, bestc):
                        bestv, bestc = candv, candc

                dpv[i], dpc[i] = bestv, bestc

            return dpv[n], dpc[n]

        limit = sum(abs(x) for x in nums) + 1
        lo, hi = 0, limit
        while lo < hi:
            mid = (lo + hi) // 2
            _, cnt = solve(mid)
            if cnt <= m:
                hi = mid
            else:
                lo = mid + 1

        ans = solve(lo)[0] + lo * m
        if lo > 0:
            ans = min(ans, solve(lo - 1)[0] + (lo - 1) * m)

        return ans