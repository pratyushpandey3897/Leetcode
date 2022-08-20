class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
#         for i in range (0, len(nums)):
#             for j in range (i+1, len(nums)):
#                 if nums[i] == nums[j]:
#                     return True
#         return False      
                    
        if len(set(nums)) == len(nums):
            return False
        return True