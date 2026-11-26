class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left = [1] * n
        #Before i
        for i in range(1, n):
            left[i] = left[i - 1] * nums[i - 1]
        #After i
        right = [1] * n
        for i in range(n-2,-1,-1):
            right[i] = right[i+1] * nums[i+1]
        #print(f"Left: {left}")
        #print(f"Right: {right}")
        answer = [1] * n

        #print("test: ", len(answer))
        for i in range(len(nums)):
            #print(f"Left: {left[i]}")
            answer[i] = left[i] * right[i]
            
        #print(f"ANSWERS: {answer}")
        return answer

