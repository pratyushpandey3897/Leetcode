class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        constr1=""
        constr2=""
        for s in word1:
            constr1 += s
        for s in word2:
            constr2 += s
        return (constr1==constr2)