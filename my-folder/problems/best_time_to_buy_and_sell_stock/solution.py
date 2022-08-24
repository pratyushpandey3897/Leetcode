import sys
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        left=0
        right=1
        
        while (right<len(prices)):
            if(prices[left] > prices[right]):
                left = right
                right+=1
            else:
                profit = prices[right] - prices[left]
                if profit > max_profit:
                    max_profit = profit
                right += 1
                

            
        return max_profit
                        
                        
                        