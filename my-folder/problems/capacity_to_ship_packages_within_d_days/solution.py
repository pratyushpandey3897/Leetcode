class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        weight_sum = sum(weights)
        
        
        max_cap = weight_sum
        min_cap = max(weights)
        ans = max_cap
        
        while (min_cap<=max_cap):
            mid = (max_cap + min_cap)//2
            day_required=1
            wt=0
            i = 0
            for i in weights:
                if (wt + i) > mid:
                    day_required+=1
                    wt =i
                else:
                    wt+= i
            print ("days: ",day_required)
            if day_required>days:
                print(min_cap, mid, max_cap)
                min_cap = mid+1
                
                
            elif day_required<=days:
                print(min_cap, mid, max_cap)
                max_cap = mid-1
                ans = min(ans, mid)
        
        return ans
                
            