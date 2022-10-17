//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
           int start=0, end=n-1, mid=(start+end)/2;
        
        if(arr[start]<arr[end]) return arr[0];
        
        else{
            while(start<end){
                if(arr[mid]>arr[end]) start=mid+1;
                else end=mid;
                mid=(start+end)/2;
            }
            return arr[mid];
        }
    }
}
