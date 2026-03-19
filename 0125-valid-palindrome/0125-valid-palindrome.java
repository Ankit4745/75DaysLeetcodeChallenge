class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String st = "";
            for (int i=0; i<n; i++){
                char ch = Character.toLowerCase(s.charAt(i));
                  if((ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9') ){
                      st += ch;
                  } 
            }
        int k = st.length();
        for(int i=0; i< k/2; i++){
    if(st.charAt(i) != st.charAt(k-i-1)){
                return false;
            
            }
        }





          return true;  
    }
}