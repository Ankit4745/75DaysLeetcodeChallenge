class Solution {
    public int sumOfPrimesInRange(int n) {
        String s = Integer.toString(n);
        String reversed = new StringBuilder(s).reverse().toString();
        int result = Integer.parseInt(reversed.toString());
        int ans =0;
        int k = Math.min(n,result);
        int e = Math.max(n,result);
        for(int i= k;i<= e;i++){
            if(isPrime(i)) ans += i;
        }
        return ans;
    }


    private static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    } 
    return true; 
}
}
