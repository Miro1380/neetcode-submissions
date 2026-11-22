class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ordered: list[int]= sorted(nums)
        nums.sort()
        for i in range(1, len(nums)):
            if(nums[i] == nums[i-1]):
                print(f"index: {nums[i]}")
                return True
        return False