class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        s1Check = [0]*26
        s2String = [0]*26

        for i in range(len(s1)):
            s1Check[ord(s1[i]) - ord('a')] += 1
            s2String[ord(s2[i]) - ord('a')] += 1
        print(s1Check)
        print(s2String)

        matches = 0
        for i in range(26):
            if s1Check[i] == s2String[i]:
                matches+=1
        print(matches)
        l = 0
        for r in range(len(s1), len(s2)):
            if matches == 26:
                return True
            index = ord(s2[r]) - ord('a')
            s2String[index] += 1 #Window moved tracking r element
            if s2String[index] == s1Check[index]:
                matches += 1
            elif s2String[index] - 1 == s1Check[index]:
                matches -= 1
            
            index = ord(s2[l]) - ord('a')
            s2String[index] -= 1 #Window moved right removing left element
            if s2String[index] == s1Check[index]:
                matches += 1
            elif s2String[index] + 1 == s1Check[index]:
                matches -= 1
            l+=1
        return matches == 26
