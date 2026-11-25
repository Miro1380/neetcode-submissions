class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequent:dict[int,int] = {}
        top = []

        for i, num in enumerate(nums):
            
            if num in frequent:
                frequent[num] += 1
            else:
                frequent[num] = 1
        
        #test = sorted(frequent,key=frequent.get, reverse=True)[:k]
        #print(Counter(frequent).most_common(k))
        #print(f"TEST: {test}")
        
        #for num in frequent:
            #top.append(num)
            #print(f"num: {num}")
        #print(f"Top: {top}")
        return [num for num, count in Counter(frequent).most_common(k)]
