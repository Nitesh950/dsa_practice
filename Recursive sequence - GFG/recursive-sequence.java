//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int N){
        // code here
        return helper(1, 1, N, 0);
    }
    static long helper(int noOfMultiples, int startingTerm ,int n, long ans){
        if(noOfMultiples==n+1){
            return ans;
        }
        long product = 1;
        int lastTerm = 0;
        for(int i=0; i<noOfMultiples;i++){
             lastTerm = (i+startingTerm);
            product *= lastTerm;
        }
        startingTerm = lastTerm+1;
        ans+=product;
        long sum = helper(noOfMultiples+1, startingTerm, n, ans);
        return sum;
        
    }
}