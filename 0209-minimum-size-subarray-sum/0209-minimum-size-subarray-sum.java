class Solution {
    public static int minSubArrayLen(int target, int[] arr)
    {
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<arr.length)
        {
            sum+=arr[j];
            if(sum>=target)
            {
                while (sum>=target)
                {
                    ans=Integer.min(ans,j-i+1);
                    sum-=arr[i];
                    i++;
                }
                
            }
            j++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}