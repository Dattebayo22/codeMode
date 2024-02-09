#User function Template for python3

class Solution:
    def nextPermutation(self, N , arr):
        # code here
        i = N-1
        flag = -1
        while i >= 1:
            if arr[i-1] < arr[i]:
                flag = i-1 
                break
            else:
                i -= 1
        if flag == -1:
                arr.reverse()
                return arr
        j = N-1
        while j > flag:
            if arr[flag]<arr[j]:
                arr[flag],arr[j] = arr[j],arr[flag]
                break;
            j -=1
        sublist = arr[flag+1:N]
        sublist.reverse()
        arr[flag+1:N]=sublist
        return arr

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        arr = input().split()
        for i in range(N):
            arr[i] = int(arr[i])
        
        ob = Solution()
        ans = ob.nextPermutation(N, arr)
        for i in range(N):
            print(ans[i],end=" ")
        print()
# } Driver Code Ends