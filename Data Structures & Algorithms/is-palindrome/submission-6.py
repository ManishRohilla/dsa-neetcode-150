class Solution:
    def isPalindrome(self, s: str) -> bool:
        ss = ""
        for e in s:
            if e.isalpha() or e.isnumeric():
                ss+=e.lower()
        print(ss)
        start = 0
        end = len(ss) - 1
        while start < end:
            if ss[start] != ss[end]:
                return False
            start += 1
            end -= 1
        return True


        