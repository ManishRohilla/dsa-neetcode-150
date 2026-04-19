class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        check = {}
        check_2 = {}
        for r in s1:
            check[r] = 1 + check.get(r, 0)
        print(check)
        l = 0
        for r in range(len(s1)-1, len(s2)):
            tempL = l
            while tempL <= r:
                check_2[s2[tempL]] = 1 + check_2.get(s2[tempL], 0)
                tempL+=1
            print(check_2)
            if check_2 == check:
                return True
            else:
                l+=1
                check_2 = {}
        return False
            
        