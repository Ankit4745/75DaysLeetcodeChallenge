class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str = s.toCharArray();
        char[] rts = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(rts);
         String S = String.valueOf(str);
        String T = String.valueOf(rts);
       if (S.equals(T)) return true;
        else return false;
    }
}