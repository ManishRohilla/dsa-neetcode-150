class Solution:
    def makeDict(self, s:str)-> dict:
        dictS = dict()
        for char in s:
            if char in dictS:
                dictS[char] +=1
            else:
                dictS[char] = 1
        return dictS

    def isAnagram(self, s: str, t: str) -> bool:
        return (self.makeDict(s) == self.makeDict(t))

        