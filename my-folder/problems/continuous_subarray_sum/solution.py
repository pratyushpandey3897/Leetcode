class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        dic = {}
        contSum = 0
        for i in range(0,len(nums)):
            
            contSum += nums[i]
            m = contSum % k
            if m==0 and i >=1:
                print("1")
                return True
            elif m in dic:
                index = dic[m]
                if (i - index) >1 :
                    print("2")
                    return True
            else:
                dic[m] = i
        return False