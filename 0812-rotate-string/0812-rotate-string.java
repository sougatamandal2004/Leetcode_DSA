class Solution {
    public boolean rotateString(String s, String goal) {
        // if(s.length() != goal.length()) return false;
        // return (s+s).contains(goal);


        // another way
        if(s.length() != goal.length()) return false;
        String doubled = s + s;
        for(int i=0;i<doubled.length() - goal.length(); i++){
            int j = 0;
            while(j < goal.length() && doubled.charAt(i + j) == goal.charAt(j)){
                j++;
            }
            if(j == goal.length()) return true;
        }
        return false;
    }
}