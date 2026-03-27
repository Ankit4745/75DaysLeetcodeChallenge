class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int n= s.length();
        int max = 0;
        HashSet<Character> hash = new HashSet<>();

        while (end < n){
            char k = s.charAt(end);
            if(hash.contains(k)){

                while(start < end && hash.contains(k)){
                   hash.remove(s.charAt(start));
                   start++;
                }
            }
            hash.add(k);
            max = Math.max(max, hash.size());
            end++;
        }
        return max;
    }
}