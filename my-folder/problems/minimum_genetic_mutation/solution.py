class Solution:
    def minMutation(self, start: str, end: str, bank: List[str]) -> int:
        if start==end:
            return 0
        if end in bank:
            q = deque()
            q.append([end,1])
            visited = []
            while(len(q) != 0):
                print (len(q))
                ele = q.popleft()
                visited.append(ele[0])
                diif_from_start = self.stringDifference(start,ele[0])
                if (diif_from_start == 1):
                    return ele[1]
                for s in bank:
                    if (s not in visited):
                        if (self.stringDifference(ele[0],s) == 1):
                            q.append([s,ele[1]+1])
            
            return -1
            
        else:
            return -1
        
    def stringDifference(self,a: str, b: str) -> int:
        p=0
        for i in range(0,len(a)):
            if (a[i]==b[i]):
                p+=1
        return len(a)-p