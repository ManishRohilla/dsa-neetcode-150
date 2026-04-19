class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numDict = dict()
        for ind, ele in enumerate(nums):
            numDict[ele] = ind
        for ind, ele in enumerate(nums):
            compliment = target - ele
            if compliment in numDict and numDict[compliment] != ind:
                return [ind, numDict[compliment]]
        return [-1, -1]

        