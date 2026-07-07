class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphaNum.append(Character.toLowerCase(ch));
            }
        }
        
        int right = alphaNum.length() - 1;       
        for (int i = 0; i < alphaNum.length(); i++) {
             int left = i;
            if (alphaNum.charAt(left) != alphaNum.charAt(right)) {
                return false;
            }
            right--;
        }

        System.out.println("Alpha: " + alphaNum);
        return true;
    }
}
