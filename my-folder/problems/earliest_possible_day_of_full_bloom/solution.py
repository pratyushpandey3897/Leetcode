class Solution:
    def earliestFullBloom(self, plantTime: List[int], growTime: List[int]) -> int:
        PT = [x for _,x in sorted(zip(growTime,plantTime), reverse =True)]
        GT = sorted(growTime,reverse=True)
        
        BT = []
        BT.append(PT[0]+GT[0])
        for i in range (1, len(GT)):
            _bt =  GT[i] + PT[i] + (BT[i-1] - GT[i-1])
            BT.append(_bt)
        
        return max(BT)