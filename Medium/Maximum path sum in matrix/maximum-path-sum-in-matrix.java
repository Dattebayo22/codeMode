//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int helper(int row,int col, int[] arr1, int[] arr2, int n, int[][] matrix, int[][] dp) {
        if(row>=n || col>=n || col<0)
            return 0;
        if(dp[row][col]!=-1)
            return dp[row][col];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<3;i++)
        {
            max=Integer.max(max,helper(row+arr1[i],col+arr2[i],arr1,arr2,n,matrix,dp));
        }
        return dp[row][col]=max+matrix[row][col];
    }
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int arr1[]={1,1,1};
        int arr2[]={-1,0,1};
        int dp[][]=new int[N+1][N+1];
        for(int i=0;i<N;i++)
            Arrays.fill(dp[i],-1);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            ans=Integer.max(ans,helper(0,i,arr1, arr2, N, Matrix, dp));
        }
        return ans;
    }
}