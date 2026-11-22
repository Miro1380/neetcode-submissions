class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        str_s = sorted(s.strip(), key=str.lower)
        str_t = sorted(t.strip(), key=str.lower)
        

        #Split it and check each value. Check for same length. Clean strings ?
        #print(f"Testing sorting: {str_s}")
        #print(f"Testing sorting: {str_t}")
        
        return str_s == str_t