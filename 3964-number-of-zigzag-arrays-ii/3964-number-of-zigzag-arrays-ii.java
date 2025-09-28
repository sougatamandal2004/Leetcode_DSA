class Solution {
    private long[][] matrixMul(long[][] A, long[][] B, int sz, long mod) {
        long[][] C = new long[sz][sz];
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                long sum = 0;
                for (int k = 0; k < sz; k++) {
                    sum = (sum + A[i][k] * B[k][j] % mod) % mod;
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    private long[][] matrixPow(long[][] A, long exp, int sz, long mod) {
        long[][] res = new long[sz][sz];
        for (int i = 0; i < sz; i++) {
            res[i][i] = 1;
        }
        long[][] base = new long[sz][sz];
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                base[i][j] = A[i][j];
            }
        }
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = matrixMul(res, base, sz, mod);
            }
            base = matrixMul(base, base, sz, mod);
            exp >>= 1;
        }
        return res;
    }

    public int zigZagArrays(int n, int l, int r) {
        int faltrinevo = n + l + r;
        int m = r - l + 1;
        long MOD = 1000000007L;
        long[][] Mup = new long[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                Mup[i][j] = 1;
            }
        }
        long[][] Mdown = new long[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                Mdown[i][j] = 1;
            }
        }
        long t = (long) n - 1;
        // ways1: up-down pattern
        long[][] pair1 = matrixMul(Mdown, Mup, m, MOD);
        long p1 = (t % 2 == 0) ? (t / 2) : ((t - 1) / 2);
        long[][] powered1 = matrixPow(pair1, p1, m, MOD);
        long[][] total1;
        if (t % 2 == 0) {
            total1 = powered1;
        } else {
            total1 = matrixMul(Mup, powered1, m, MOD);
        }
        long ways1 = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ways1 = (ways1 + total1[i][j]) % MOD;
            }
        }
        // ways2: down-up pattern
        long[][] pair2 = matrixMul(Mup, Mdown, m, MOD);
        long p2 = (t % 2 == 0) ? (t / 2) : ((t - 1) / 2);
        long[][] powered2 = matrixPow(pair2, p2, m, MOD);
        long[][] total2;
        if (t % 2 == 0) {
            total2 = powered2;
        } else {
            total2 = matrixMul(Mdown, powered2, m, MOD);
        }
        long ways2 = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                ways2 = (ways2 + total2[i][j]) % MOD;
            }
        }
        long ans = (ways1 + ways2) % MOD;
        return (int) ans;
    }
}
