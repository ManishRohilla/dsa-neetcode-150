class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count =  {}
        res = -1
        l = 0 
        maxf = -1
        for r in range(len(s)):
            if s[r] not in count.keys():
                count[s[r]] = 1
            else:count[s[r]] += 1
            maxf = max(maxf,count[s[r]])

            while (r-l+1) - maxf > k :
                count[s[l]] -= 1
                l+=1
                
            res = max(res, r-l+1)
        return res
