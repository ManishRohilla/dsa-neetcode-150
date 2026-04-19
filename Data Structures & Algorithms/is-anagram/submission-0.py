class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) and (len(s) or len(t)):
            return False
        else:
            wordCounts = {}
            wordCountt = {}
            for i in s:
                if i in wordCounts:
                    wordCounts[i] += 1
                else:
                    wordCounts[i] = 1
            for i in t:
                if i in wordCountt:
                    wordCountt[i] += 1
                else:
                    wordCountt[i] = 1
            print(wordCounts)
            print(wordCountt)
        return wordCounts == wordCountt