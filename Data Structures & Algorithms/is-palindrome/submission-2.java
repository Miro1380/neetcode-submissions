class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphaNum.append(Character.toLowerCase(ch));
            }
        }
        
        int left = 0;
        int right = alphaNum.length()-1;
        while(left < right){
            if(alphaNum.charAt(left) != alphaNum.charAt(right)){
                return false;
            }
            left++;
            right--;
        }


        
        return true;
    }
}
