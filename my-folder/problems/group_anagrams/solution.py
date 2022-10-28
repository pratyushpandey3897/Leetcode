class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        p={}
        for wrd in strs:
            a = sorted(wrd)
            a = ''.join(a)
            if a in p:
                p[a].append(wrd)
            else:
                p[a] = [wrd]
        return p.values()