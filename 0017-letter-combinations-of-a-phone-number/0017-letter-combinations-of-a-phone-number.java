class Solution {
    
    private static final String[] MAP = {
        "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    private void fun(String digits, int ptr, StringBuilder curr, List<String> res) {
       
        if(ptr == digits.length()) {
            res.add(curr.toString()); 
            return;
        }
        
        int len = curr.length(); 
        String poss = MAP[digits.charAt(ptr) - '2'];
        for(int i = 0; i < poss.length(); i++){
            curr.append(poss.charAt(i));
            
            fun(digits, ptr + 1, curr, res); 
            
            curr.setLength(len);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res; // 
        
        fun(digits, 0, new StringBuilder(), res);
        return res;
    }
}