// Last updated: 8/27/2026, 9:13:07 AM
1class Solution {
2  public List<Integer> findDisappearedNumbers(int[] nums) {
3    List<Integer> ans = new ArrayList<>();
4
5    for (final int num : nums) {
6      final int index = Math.abs(num) - 1;
7      nums[index] = -Math.abs(nums[index]);
8    }
9
10    for (int i = 0; i < nums.length; ++i)
11      if (nums[i] > 0)
12        ans.add(i + 1);
13
14    return ans;
15  }
16}