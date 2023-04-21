class Solution {
    public String removeKdigits(String num, int k) {
        int n= num.length();
        Stack<Character> st= new Stack<>();
        for(int i=0; i<n; i++)
        {
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0)
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        if(st.size()==0)
            return "0";  
        StringBuilder result= new StringBuilder();
        while(!st.isEmpty())
            result.append(st.pop());

        String res= result.reverse().toString();
        int i=0;
        while(i<res.length() && res.charAt(i)=='0')
            i++;

        res= res.substring(i,res.length());

        if(res.length()==0)
            return "0";
        return res;
    }
}