class Solution {
    static final int MOD = 1_000_000_007;
    private long calculate(long x, long y){
        if(y == 0){
            return 1;
        }
        long half = calculate(x, y/2);
        long parAns = (half*half)%MOD;
        if(y%2 == 1){
            parAns = (parAns * x) % MOD;
        }
        return parAns;
    }
    public int countGoodNumbers(long n) {
        long odd = 0, even = 0;
        odd = n/2;
        even = n/2 + n%2;
        long ans1 = calculate(5, even);
        long ans2 = calculate(4, odd);
        return (int)((ans1*ans2)%MOD);
    }
}