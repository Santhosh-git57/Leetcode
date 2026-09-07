// Last updated: 9/7/2026, 8:38:52 PM
1class Solution {
2    public String validIPAddress(String queryIP) {
3        int len = queryIP.length();
4        int ind = 0;
5        while(ind < len && queryIP.charAt(ind) != '.' && queryIP.charAt(ind) != ':') {
6            if(ind+1 > 4) return "Neither";
7            ind++;
8        }
9        if(ind == 0) return "Neither";
10
11        String[] arr;
12        if(queryIP.charAt(ind) == '.') {
13            if(queryIP.charAt(len-1) == '.') return "Neither";
14            
15            arr = queryIP.split("\\.");
16            if(arr.length != 4) return "Neither";
17
18            if(checkIP4Valid(arr)) return "IPv4";
19        }
20        else{
21            if(queryIP.charAt(len-1) == ':') return "Neither";
22            
23            arr = queryIP.split(":");
24            System.out.println(arr.length+" len ");
25            if(arr.length != 8) return "Neither";
26
27            if(checkIP6Valid(arr)) return "IPv6";
28        }
29
30        return "Neither";
31    }
32
33    public boolean checkIP4Valid(String[] arr){
34
35        for(String ele: arr){
36            int len = ele.length();
37            if(ele.isEmpty() || len > 3) return false;
38            if(len > 1 && ele.charAt(0) == '0') return false;
39
40            int mul = 0;
41            for(int i = 0;i < len;i++){
42                char ch = ele.charAt(i);
43                if(!Character.isDigit(ch)) return false;
44
45                mul *= 10;
46                mul += ch - '0';
47            }
48
49            if(mul < 0 || mul > 255) return false;
50        }
51
52        return true;
53    }
54
55    public boolean checkIP6Valid(String[] arr){
56
57        for(String ele: arr){
58            int len = ele.length();
59            if(ele.isEmpty() || len > 4) return false;
60
61            for(int i = 0;i < len;i++){
62                char ch = ele.charAt(i);
63                if(!Character.isDigit(ch) && !Character.isAlphabetic(ch)) return false;
64                if(Character.isAlphabetic(ch)) {
65                    if(Character.isUpperCase(ch) && (ch < 'A' || ch > 'F')) return false;
66                    if(Character.isLowerCase(ch) && (ch < 'a' || ch > 'f')) return false;
67                }
68            }
69        }
70        return true;
71    }
72}