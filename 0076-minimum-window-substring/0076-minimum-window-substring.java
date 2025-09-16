class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i=0, j = 0, n = s.length();
        int count = map.size();
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while(j < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) count--;
            }

            while(count == 0){
                if(j - i + 1 < minLen){
                    minLen = j - i + 1;
                    startIndex = i;
                }

                char leftChar = s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);
                    if(map.get(leftChar) > 0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}