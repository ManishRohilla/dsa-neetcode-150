class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ''
        for ele in strs:
            encoded += ele + '#|#'
        print(encoded)
        return encoded

    def decode(self, s: str) -> List[str]:
        result = s.split('#|#')
        if result[-1] == "":
            result = result[0:-1]
        return result
