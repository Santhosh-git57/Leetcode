// Last updated: 8/27/2026, 9:14:05 AM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3
4        int count=0;
5        HashMap<Integer,Integer>map=new HashMap<>();
6        for(int i=0;i<nums1.length;i++)
7        {
8            for(int j=0;j<nums2.length;j++)
9            {
10                int sum=nums1[i]+nums2[j];
11                if(map.containsKey(sum))
12                {
13                    int freq=map.get(sum);
14                    map.put(sum,freq+1);
15                }
16                else
17                {
18                    map.put(sum,1);
19                }
20            }
21        }
22        for(int i=0;i<nums3.length;i++)
23        {
24            for(int j=0;j<nums4.length;j++)
25            {
26                int sum=nums3[i]+nums4[j];
27                if(map.containsKey(-sum) )
28                {
29                    count+=map.get(-sum);
30                }
31            }
32        }
33        return count;
34
35    }
36}