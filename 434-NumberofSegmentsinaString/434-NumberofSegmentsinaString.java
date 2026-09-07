// Last updated: 9/7/2026, 8:37:22 PM
1class Solution {
2   public int[] findRightInterval(int[][] intervals) {
3        int n = intervals.length;
4        int[] arr = new int[n];
5        int[] ans = new int[n];
6        for(int i = 0; i < n; ++i)
7            arr[i] = intervals[i][0];
8        Map<Integer,Integer> map = new HashMap<>();
9        for(int i = 0; i < n; ++i)
10            map.put(arr[i],i);
11        Arrays.sort(arr);
12        for(int i = 0; i < n; ++i){
13            int val = binarySearch(arr,intervals[i][1]);
14            if(val == -1)
15                ans[i] = -1;
16            else
17             ans[i] = map.get(arr[val]);
18        }
19        return ans;
20    }
21    int binarySearch(int[] arr,int target){
22        int l = 0;
23        int r = arr.length - 1;
24        int ans = -1;
25        while(l <= r){
26            int mid = l + (r - l)/2;
27            if(arr[mid] == target)
28                return mid;
29            else if(arr[mid] > target){
30                ans = mid;
31                r = mid - 1;
32            }
33            else
34                l = mid + 1;
35        }
36        return ans;
37    }
38
39
40
41
42        }
43        