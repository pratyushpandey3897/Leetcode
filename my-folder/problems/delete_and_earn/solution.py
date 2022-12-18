class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        a = [0] * 10001
        for num in nums:
            a[num] += num 
        return self.solve(a)
        
    def solve(self,a):
        l1 = a[0]
        l2 = a[1]

        loot =0
        for i in range (2,len(a)):
            loot = max(a[i] + l1, l2)
            l1=l2
            l2=loot
        return loot

        
        