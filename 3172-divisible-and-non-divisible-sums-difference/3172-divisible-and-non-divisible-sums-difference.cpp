class Solution {
public:
    int differenceOfSums(int n, int m) {
        int notDivSum = 0;
        int divSum = 0;
        for(int i=1;i<=n;i++){
            if(i%m != 0) notDivSum += i;
            else divSum += i;
        }
        return notDivSum - divSum;
    }
};