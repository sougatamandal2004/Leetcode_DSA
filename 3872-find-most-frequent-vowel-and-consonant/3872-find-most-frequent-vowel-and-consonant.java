class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int x = 0, y = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(isVowel(key)){
                if(value > x){
                    x = value;
                }
            }
            else{
                if(value > y){
                    y = value;
                }
            }
        }
        return (x + y);
    }
    private boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
}