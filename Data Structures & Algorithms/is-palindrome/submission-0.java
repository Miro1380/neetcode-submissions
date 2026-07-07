class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphaNum.append(Character.toLowerCase(ch));
            }
        }

        System.out.println("Alpha:" + alphaNum);
        int right = alphaNum.length() - 1;
       
        for (int i = 0; i < alphaNum.length(); i++) {
             int left = i;
            System.out.println("LEFT: " + alphaNum.charAt(left));
            System.out.println("RIGHT: " + alphaNum.charAt(right));
            if (alphaNum.charAt(left) != alphaNum.charAt(right)) {
                System.out.println("BREAKING");
                return false;
            }
            right--;
        }

        System.out.println("Alpha: " + alphaNum);
        return true;
    }
}
