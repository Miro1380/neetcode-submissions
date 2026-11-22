class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numbers = []

        for i in range(len(nums)):
            for j in range(1,len(nums)):
                n1 = nums[i]
                n2 = nums[j]
                if n1+n2 == target and i != j:
                    numbers.append(i)
                    numbers.append(j)
                    return numbers

        return numbers