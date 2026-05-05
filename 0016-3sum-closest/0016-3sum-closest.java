class Solution {
    public int threeSumClosest(int[] num, int tar) {
        Arrays.sort(num);
        int n = num.length;
        int result = num[0] + num[1] + num[2]; 

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;

            while (l < r) {
                int add = num[i] + num[l] + num[r];

                if (Math.abs(tar - add) < Math.abs(tar - result)) {
                    result = add;
                }

                if (add == tar) return tar;
                else if (add < tar) l++;
                else r--;
            }
        }

        return result;
    }
}