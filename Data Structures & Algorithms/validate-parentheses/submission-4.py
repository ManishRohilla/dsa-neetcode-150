class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapClose = {')': '(', ']':'[', '}':'{'}

        for br in s:
            if br in mapClose:
                if stack and mapClose[br] == stack[-1]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(br)
            
        return len(stack) == 0