//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    long[] Series(int N) {
        // code here
         long[] ans = new long[N+1];
         boolean[] flag = new boolean[N+1];
        long x = helper(N, ans, flag);
        return ans;
    }
    
    long helper(int N, long[] arr, boolean[] flag){
        if(N==0 || N==1){
            if(flag[N] == false){
                flag[N] = true;
                arr[N] = N;
                return (long)N;
            }else{
                return arr[N];
            }
        }
        if(flag[N] == true){
            return arr[N];
        }else{
            long sum = helper(N-1, arr, flag) + helper(N-2, arr, flag);
            flag[N] = true;
            arr[N] = sum;
            return arr[N];
        }
        
            
  
    }
    
}