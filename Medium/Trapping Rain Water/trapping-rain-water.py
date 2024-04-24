
class Solution:
    def trappingWater(self, arr,n):
        #Code here
          left = [0]*n
          right = [0]*n 
    
          left[0] = 0
          lMax = arr[0]
    
          right[-1] = 0
          rMax = arr[-1]
    
          for i in range(1,n):
                left[i] = lMax
                lMax = max(lMax,arr[i])
          i = n-2
          while i >= 0:
                right[i] = rMax
                rMax = max(rMax,arr[i])
                i -= 1
          ans = 0
          currMin = 0
          for i in range(n):
               currMin = min(left[i],right[i]) 
               if currMin == 0 or arr[i] >= currMin:
                     continue
               ans += currMin - arr[i]
          return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math



def main():
        T=int(input())
        while(T>0):
            
            n=int(input())
            
            arr=[int(x) for x in input().strip().split()]
            obj = Solution()
            print(obj.trappingWater(arr,n))
            
            
            T-=1


if __name__ == "__main__":
    main()



# } Driver Code Ends