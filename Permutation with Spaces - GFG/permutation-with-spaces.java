//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
    	return solve(S, S.substring(0,1), 1);
    	
    }
    
    ArrayList<String> solve(String input, String output, int index) {
        if(index == input.length()) {
        	ArrayList<String> base = new ArrayList<>();
        	base.add(output);
        	return base;
        }
        if(output.length()>2) {
            char lc = output.charAt(output.length()-1);
            char slc = output.charAt(output.length()-2);
            if(lc == ' ' && lc == slc) {
            	return new ArrayList<>();
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        ArrayList<String> val2 = solve(input, output + " ", index);
        ArrayList<String> val1 = solve(input, output + input.charAt(index), index+1);
        
        for(String val: val2) {
        	ans.add(val);
        }
        for(String val: val1) {
        	ans.add(val);
        }
        
        return ans;
    }
    
}