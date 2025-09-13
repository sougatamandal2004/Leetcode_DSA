class Solution {
    public int maxFreqSum(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // for(char ch : s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // int x = 0, y = 0;
        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     char key = entry.getKey();
        //     int value = entry.getValue();
        //     if(isVowel(key)){
        //         if(value > x){
        //             x = value;
        //         }
        //     }
        //     else{
        //         if(value > y){
        //             y = value;
        //         }
        //     }
        // }
        // return (x + y);


        // another way
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        int x = 0, y = 0;
        for(int i = 0; i< 26;i++){
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20){
                if(count[i] > x) x = count[i];
            }
            else{
                if(count[i] > y) y = count[i];
            }
        }
        return (x + y);
    }
    // private boolean isVowel(char ch){
    //     return "aeiou".indexOf(ch) != -1;
    // }
}