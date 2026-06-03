class Solution {
    public int fib(int n) {
        int a =0;
        int b=1;
        if(n == a) return a;
        if(n == b) return b;
         for (int i=2; i<=n; i++){
            int fina = a + b;
            a = b;
            b = fina;
        }
        return b;
    }
}