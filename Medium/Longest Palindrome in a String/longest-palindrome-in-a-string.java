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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int ans=1;
        int n=S.length();
        int st=0;
        int en=0;
        for(int i=1;i<=n-1;i++)
        {
            int start=i-1;
            int end=i;
            while(start>=0 && end<n && S.charAt(start)==S.charAt(end))
            {
                int temp=Math.max(ans,end-start+1);
                if(temp>ans)
                {
                    st=start;
                    en=end;
                }
                ans=temp;
                start--;
                end++;
            }
            start=i-1;
            end=i+1;
            while(start>=0 && end<n && S.charAt(start)==S.charAt(end))
            {
                int temp=Math.max(ans,end-start+1);
                if(temp>ans)
                {
                    st=start;
                    en=end;
                }
                ans=temp;
                start--;
                end++;
            }
        }
        // System.out.print(ans);
        if(st==en)
                return S.substring(0,1);
        return S.substring(st,en+1);
    }
}