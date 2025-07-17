class Solution {
    public int compress(char[] chars) {
        Integer count = 1;
        List<String> list = new ArrayList<>();
        for(int i=1;i<chars.length; i++){
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                list.add(String.valueOf(chars[i-1]));
                if(count > 1){ 
                    list.add(count.toString());
                    count = 1;
                }
            }
        }
        list.add(String.valueOf(chars[chars.length - 1]));
        if(count > 1) list.add(count.toString());

        int idx = 0;
        for(String str : list){
            for(char ch : str.toCharArray()){
                chars[idx++]  = ch;
            }
        }
        return idx;
    }
}