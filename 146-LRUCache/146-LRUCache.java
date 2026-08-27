// Last updated: 8/27/2026, 9:07:31 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        
5        for(int num : nums1){
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8
9        List<Integer> list = new ArrayList<>();
10        
11        for(int elem : nums2){
12            if(map.getOrDefault(elem, 0) > 0){
13                list.add(elem);
14                map.put(elem, map.get(elem) - 1);
15            }
16        }
17
18        int[] result = new int[list.size()];
19        int i = 0;
20        
21        for(int val : list){
22            result[i++] = val;
23        }
24
25        return result;
26    }
27}