class Solution:

    def sortEle(self,s:str) -> str:
        s = list(s)
        n = len(s)
        for i in range(n):
            swapped = False
            for j in range(0, n-i-1):
                if s[j] > s[j+1]:
                    s[j], s[j+1] = s[j+1], s[j]
                    swapped = True
            if not swapped:
                break
        return ''.join(s)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groupDict = dict()
        for ele in strs:
            sortedEle = self.sortEle(ele)
            if sortedEle in groupDict:
                groupDict[sortedEle].append(ele)
            else:
                groupDict[sortedEle] = [ele]
        print(groupDict)
        return groupDict.values()

            
        