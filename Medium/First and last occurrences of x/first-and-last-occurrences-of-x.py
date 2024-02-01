#User function Template for python3


class Solution:
    def find(self, arr, n, x):
        i = 0
        j = n-1
        lans, rans = -1,-1
        while i <= j:
                mid = (j + i)//2
                if arr[mid] > x:
                        j = mid-1
                elif arr[mid] < x:
                        i = mid+1
                else:
                        lans=mid
                        j = mid-1
        i,j = 0,n-1
        while i <= j:
                mid = (j + i)//2
                if arr[mid] > x:
                        j = mid-1
                elif arr[mid] < x:
                        i = mid+1
                else:
                        rans=mid
                        i = mid+1
        return [lans,rans]
            


#{ 
 # Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ob = Solution()
    ans=ob.find(arr,n,x)
    print(*ans)
# } Driver Code Ends