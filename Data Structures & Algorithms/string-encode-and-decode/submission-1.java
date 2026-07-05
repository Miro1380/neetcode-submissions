class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";

        for(String str : strs){
            Integer length = str.length();
            String encode = length + "#"+ str;
            //System.out.println("Encoding: "+ encode);
            encodedString+= encode;
        }

        //System.out.println("Encoded String: "+ encodedString);
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedList= new ArrayList<>();
        int i = 0;
        int j = 1;
        
        //System.out.println("j: "+ j);
        //System.out.println("TEST BEFORE str.length(): "+ str.length());

        while(j < str.length()){

            //If j finds a # take a substring from i to j?
            //The word starts at j+1 and ends at j+1 + length (number before #)
            //Take substring, move i to end value (j+1+length) and move j to +1 of that?
            //System.out.println("CHAR: "+ str.charAt(j));
            if(str.charAt(j) == '#'){
                Integer length = Integer.parseInt(str.substring(i,j));
                Integer begin = j+1;
                Integer end = j+1+length;
                String decode = str.substring(begin, end);
                decodedList.add(decode);
                i = end;
                j = i;
                continue;
            }
            j++;
        }
        return decodedList; 
    }
}
