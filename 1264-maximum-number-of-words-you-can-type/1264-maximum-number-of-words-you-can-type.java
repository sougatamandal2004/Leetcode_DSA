class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // String[] arr = text.split("\\s+");
        // int ans = arr.length;
        // for(String s : arr){
        //     for(char ch : brokenLetters.toCharArray()){
        //         if(s.indexOf(ch) != -1){
        //             ans -= 1;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // optimal approach
        boolean[] broken = new boolean[26];
        for(char ch : brokenLetters.toCharArray()){
            broken[ch - 'a'] = true;
        }

        int ans = 0;
        boolean valid = true;
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == ' '){
                if(valid) ans++;
                valid = true;
            }
            else{
                if(broken[ch - 'a']) valid = false;
            }
        }
        if(valid) ans++;
        return ans;
    }
}