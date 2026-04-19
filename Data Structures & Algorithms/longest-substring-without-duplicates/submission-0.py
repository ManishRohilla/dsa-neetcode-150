class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        charSet = set()
        res = 0

        for r in range(len(s)):
            while s[r] in charSet:
                print("remove ",s[l])
                charSet.remove(s[l])
                print(charSet)
                l+=1
            print("add",s[r])
            charSet.add(s[r])
            print(charSet)
            res = max(res, r-l+1)
        return res