class Solution {
    
    public int evalRPN(String[] tokens) {
         Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = st.pop();
                int a = st.pop();

                if (token.equals("+")) st.push(a + b);
                else if (token.equals("-")) st.push(a - b);
                else if (token.equals("*")) st.push(a * b);
                else st.push(a / b); 
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }  private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}