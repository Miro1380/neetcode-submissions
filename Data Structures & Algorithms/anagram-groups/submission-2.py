class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Sort the strings, use it as a key, check if element fits key, if it is: add it to key's list
        counts = {}
        for string in strs:
            key = "".join(sorted(string))
            #print(f"String: {key}")
            if key in counts:
                counts[key].append(string)
            else:
                counts[key] = [string]
        #print(f"strings: {strs}")
        
        #print(counts)

        return list(counts.values())