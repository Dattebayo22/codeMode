class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i = len(nums)-2
        while i >= 0 and nums[i+1] <= nums[i]:
              i -= 1
        if i >= 0:
              j = len(nums)-1
              while j >= i+1 and nums[j] <= nums[i]:
                     j -= 1
              nums[j],nums[i] = nums[i],nums[j]
        nums[i+1:] = nums[i+1:][::-1]
        return nums
        