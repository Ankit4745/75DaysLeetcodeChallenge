class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIdx = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            lastIdx[s.charAt(i) - 'a'] = i;
        }
        
        boolean[] seen = new boolean[26];
        
        char[] stack = new char[26];
        int top = -1; 
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if (seen[idx]) {
                continue;
            }
            
        
            while (top >= 0 && stack[top] > c && lastIdx[stack[top] - 'a'] > i) {
                seen[stack[top] - 'a'] = false;
                top--;
            }
            
            stack[++top] = c;
            seen[idx] = true;
        }
        
        return new String(stack, 0, top + 1);
    }
}