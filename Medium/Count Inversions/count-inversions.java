//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static public long merge(long a[],int low,int high)
    {
        long temp[]=new long[high-low+1];
        int st=low;
        long inversions=0;
        int mid=low+(high-low)/2;
        int end=mid+1;
        int i=0;
        while(st<=mid && end<=high)
        {
            if(a[st]<=a[end])
            {
                temp[i]=a[st];
                st++;
            }
            else
            {
                inversions+=(mid-st+1);
                temp[i]=a[end];
                end++;
            }
            i++;
        }
        while(st<=mid)
        {
            temp[i]=a[st];
            i++;
            st++;
        }
        while(end<=high)
        {
            temp[i]=a[end];
            i++;
            end++;
        }
        i=0;
        while(low<=high)
        {
            a[low]=temp[i];
            i++;
            low++;
        }
        return inversions;
    }
    static public long helper(long a[],int i,int j)
    {
        long ans=0;
        if(i>=j)
            return 0;
        int mid=i+(j-i)/2;
        ans+=helper(a,i,mid);
        ans+=helper(a,mid+1,j);
        ans+=merge(a,i,j);
        return ans;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n=(int)N;
        return helper(arr,0,n-1);
    }
}