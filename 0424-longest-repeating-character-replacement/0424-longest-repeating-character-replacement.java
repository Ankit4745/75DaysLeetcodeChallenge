class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l=0;
        int ml=0;
        int mf=0;
         for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            
            mf = Math.max(mf, arr[s.charAt(right) - 'A']);
            
          
            while ((right - l + 1) - mf > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            ml = Math.max(ml, right - l + 1);
        }
        
        return ml;
    }
}