class Solution {

        public boolean fre(int fe1[], int fe2[]){
            for(int i=0;i<26;i++){
            if(fe1[i] != fe2[i]){
                return false;
              
            }
            }
            return true;
        }
    public boolean checkInclusion(String s1, String s2) {
      int n= s1.length();
      int m= s2.length();
      if (n > m) return false;
      int S1[] = new int[26];
      int S2[] = new int[26];
      for(int i=0;i<n;i++){
        S1[s1.charAt(i) - 'a']++;
        S2[s2.charAt(i) - 'a']++;
      }
      if(fre(S1,S2)){
        return true;
      }
    for(int i=1;i<=m-n;i++){
         S2[s2.charAt(i-1) - 'a']--;
          S2[s2.charAt(i+n-1) - 'a']++;
          if(fre(S1,S2)){
        return true;
      }
    }return false;

        
    }
}