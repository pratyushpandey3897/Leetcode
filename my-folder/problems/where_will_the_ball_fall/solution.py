class Solution:
    def findBall(self, grid: List[List[int]]) -> List[int]:
        a=[]
        for i in range (0, len(grid[0])):
            
            a.append( self.dfs(0, i,grid) )
        return a
    
    def dfs(self,p:int, col:int,grid: List[List[int]]) -> int:
        
        m = len(grid) #rows
        n = len(grid[0]) #columns or balls
        
        
        if ((col < 0 or col>n-1 ) and p !=m):
            return -1
        elif (p==m):
            return col
        
        
        ele = grid[p][col]
        
        if (ele == -1):
            if (col == 0 or grid[p][col-1] == 1):
                return -1
            elif grid[p][col-1] == -1:
                return self.dfs(p+1, col-1, grid)
            
        elif ele == 1:
            if (col == n-1 or grid[p][col+1] == -1):
                return -1
            elif grid[p][col+1] == 1:
                return self.dfs(p+1, col+1,grid)
                