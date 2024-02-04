class Solution:
    def maxDistToClosest(self, seats: List[int]) -> int:
        l = []
        r = []
        stack = []
        n = len(seats)
        for i in range(n):
            if seats[i] == 1:
                l.append(-1)
                stack.append(i)
            else:
                if len(stack) > 0:
                    l.append(i-stack[len(stack)-1])
                else:
                    l.append(pow(10,5))
        stack.clear()
        i = n-1
        while i >= 0:
            if seats[i] == 1:
                r.append(-1)
                stack.append(i)
            else:
                if len(stack) > 0:
                    r.append(stack[len(stack)-1]-i)
                else:
                    r.append(pow(10,5))
            i=i-1
        # print(l)
        r.reverse()
        # print(r)
        ans = -1
        for i in range(n):
            ans = max(min(l[i],r[i]),ans)
        return ans
        