class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // int i=0, j = 0, size = s.length();
        // int maxLen = 0;
        // while(j < size){
        //     char ch = s.charAt(j);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        //     while(map.get(ch) > 1){
        //         char left = s.charAt(i);
        //         map.put(left, map.get(left) - 1);
        //         if(map.get(left) == 0) map.remove(left);
        //         i++;
        //     }
        //     maxLen = Math.max(maxLen, j - i + 1);
        //     j++;
        // }
        // return maxLen;


        // another way
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0, j = 0, size = s.length();
        int maxLen = 0;
        int count = 0;
        while(j < size){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            count++;
            if(map.size() == count){
                maxLen = Math.max(maxLen, j - i + 1);
            }
            else{
                while(map.get(ch) > 1){
                    char left = s.charAt(i);
                    map.put(left, map.get(left) - 1);
                    if(map.get(left) == 0) map.remove(left);
                    i++;
                    count--;
                }
            }
            j++;
        }
        return maxLen;
    }
}