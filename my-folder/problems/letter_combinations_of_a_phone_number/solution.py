class Solution:
    def letterCombinations(self, digits: str) -> List[str]:

        dic = {
            "2":"abc",
            "3":"def",
            "4":"ghi",
            "5":"jkl",
            "6":"mno",
            "7":"pqrs",
            "8":"tuv",
            "9":"wxyz"
        }
        res =[]
        def backtrack(self, i, currstr):
            if(len(digits) == len(currstr)):
                res.append(currstr)
                return
            
            for char in dic[digits[i]]:
                backtrack(self, i+1, currstr+char)
        if (len(digits) > 0):
            backtrack(self,0,"")

        return res

        

        

        
