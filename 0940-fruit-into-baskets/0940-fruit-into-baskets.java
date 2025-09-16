class Solution {
    public int totalFruit(int[] fruits) {
        int i=0,j=0,n = fruits.length;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(j < n){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while(map.size() > 2){
                int temp = fruits[i];
                map.put(temp, map.get(temp) - 1);
                if(map.get(temp) == 0) map.remove(temp);
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}