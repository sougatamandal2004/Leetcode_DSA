class Solution {
public:
    int subtractProductAndSum(int n) {
        int num = n;
        int mul = 1;
        int sum = 0;
        while(num){
            int x = (num % 10);
            mul *= x;
            sum += x;
            num/=10;
        }
        return mul - sum;
    }
};