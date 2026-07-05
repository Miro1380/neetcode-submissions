class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            System.out.println("Different lengths. Failed. Exiting...");
            return false;
        }

        //Char Array --> Sort --> String constructor
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String sSorted = new String(sChars);
        String tSorted = new String(tChars);

        if(!sSorted.equals(tSorted)){
            return false;
        }

        return true;
    }
}
