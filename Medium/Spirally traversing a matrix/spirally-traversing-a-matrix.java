//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int stR=0;
        int enR=r-1;
        int stC=0;
        int enC=c-1;
        int totalEle=r*c;
        int ct=0;
        while(ct<totalEle)
        {
            for(int i=stC;i<=enC;i++)
            {
                ans.add(matrix[stR][i]);
                ct++;
                if(ct>=totalEle)
                    return ans;
            }
            stR++;
            for(int i=stR;i<=enR;i++)
            {
                ans.add(matrix[i][enC]);
                ct++;
                if(ct>=totalEle)
                    return ans;
            }
            enC--;
            for(int i=enC;i>=stC;i--)
            {
                ans.add(matrix[enR][i]);
                ct++;
                if(ct>=totalEle)
                    return ans;
            }
            enR--;
            for(int i=enR;i>=stR;i--)
            {
                ans.add(matrix[i][stC]);
                ct++;
                if(ct>=totalEle)
                    return ans;
            }
            stC++;
        }
        return ans;
    }
}   
