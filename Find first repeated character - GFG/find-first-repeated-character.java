//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        Stack<Character> stack = new Stack<Character>();
        String res = "";
        for(int i=0;i<s.length();i++){
            if(!stack.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                res+=s.charAt(i);
                return res;
            }
        }
        return "-1";
    }
} 