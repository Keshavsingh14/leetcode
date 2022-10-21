//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int n){
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        for(int i=2; i<=n; i++){
            int carry=0;
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=res.size()-1; j>=0; j--){
                int curr=res.get(j)*i+carry;
                temp.add(0,curr%10);
                carry=curr/10;
            }
            while(carry!=0){
                temp.add(0,carry%10);
                carry/=10;
            }
            res=temp;
         }
         return res;
    }
}