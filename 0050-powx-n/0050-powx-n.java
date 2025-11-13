class Solution {
    public double myPow(double x, int n) {
        // if(N == 0) return 1.0;
        // if(N < 0) return (1.0 / myPow(x,-N));
        // double half = myPow(x, N/2);
        // double ans = half * half;
        // if(n%2 != 0){
        //     ans *= x;
        // }
        // return ans;

        // the bast way
        long N = n;
        if(N == 0) return 1.0;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return power(x, N);
    }

    private double power(double x, long n){
        if(n == 0) return 1.0;
        double half = power(x, n/2);
        double ans = half * half;
        if(n%2 != 0){
            ans *= x;
        }
        return ans;
    }
}