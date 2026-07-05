class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList();
        
        for(String str : strs){
            //Turn to char[], sort (void return), turn to string.
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sorted = new String(chArr);
            System.out.println("Sorted: "+ sorted);
            
            //Exists Add to list
            if(map.containsKey(sorted)){
                System.out.println("Adding to key's list: "+ sorted);
                List newStr = map.get(sorted);
                newStr.add(str);
                map.put(sorted, newStr);
            }

            //Doesnt Exist, add entry
            else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                System.out.println("Making key: "+ sorted);
                System.out.println("Adding to inner list: "+ str);
                map.put(sorted,newList);

            }
        }
        for(List<String> innerList : map.values()){
            list.add(innerList);
        }   
        System.out.println("Map:" + map.values());
        System.out.println("Final List: "+ list);
        return list;
    }
}
