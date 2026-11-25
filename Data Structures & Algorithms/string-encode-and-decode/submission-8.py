class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        if not strs:
            print("Empty CASE")
            return ""
        for s in strs:
            encoded += str(len(s))+"#"+s     
        
        print(f"ENCODED: {encoded}")
        return encoded

    def decode(self, s: str) -> List[str]:
        decoded = []
        j = 0
        while j < len(s):   
            #Find the index of the symbol to start a new word
            i = int(s.find("#",j))
            #Used to find the length of the word
            length = int(s[j:i])
            decoded.append(s[i+1:i+1+length])
            j = i+1+length

        print(f"Decoded: {decoded}")
        return decoded 