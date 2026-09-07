// Last updated: 9/7/2026, 8:39:16 PM
1class Solution {
2    Set<List<Integer>> lists;
3    public List<List<Integer>> findSubsequences(int[] nums) {
4        lists = new HashSet<>();
5        recursion(nums,0,new ArrayList());
6        
7        return new ArrayList(lists);
8    }
9    void recursion(int[] nums,int curr,List<Integer> temp)
10    {
11        if(temp.size() >= 2)
12            lists.add(new ArrayList(temp));
13            
14        for(int i=curr;i<nums.length;i++)
15        {
16            if(temp.size()==0 || temp.get(temp.size()-1) <= nums[i])
17            {
18                temp.add(nums[i]);
19                recursion(nums,i+1,temp);
20                temp.remove(temp.size()-1);
21            }
22        }
23    }
24}