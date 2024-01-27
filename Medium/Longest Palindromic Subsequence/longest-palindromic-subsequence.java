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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int helper(int i,int j,String S,int dp[][])
    {
        if(i>j)
            return 0;
        if(dp[i-1][j-1]!=0)
            return dp[i-1][j-1];
        if(i==j && S.charAt(i-1)==S.charAt(j-1))
            return dp[i-1][j-1]=1;
        else if(S.charAt(i-1)==S.charAt(j-1))
            return dp[i-1][j-1]=helper(i+1,j-1,S,dp)+2;
        return dp[i-1][j-1]=Integer.max(helper(i+1,j,S,dp),helper(i,j-1,S,dp));
    }
    public int longestPalinSubseq(String S)
    {
        //code here
        int n=S.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[0],0);
        return helper(1,n,S,dp);
    }
}