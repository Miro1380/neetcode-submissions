class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        int[] frequent = new int[k];

        for(int num : nums){
            //If already exists, increment
            if(frequencyMap.containsKey(num)){
                int value = frequencyMap.get(num);
                frequencyMap.put(num, value+1);
            }

            //Else, add new entry
            else{
                frequencyMap.put(num, 1);
            }
        }
        List<Integer[]> list = new ArrayList();
        //Entry set has Key, value
        //Create a new array with {value, key}
        //Sort list, then iterate from the right to left for max.
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            Integer[] pair = {entry.getValue(), entry.getKey()};
            System.out.println(pair[0]+" , "+pair[1]);
            list.add(pair);
            
        }
        list.sort( (a,b) -> Integer.compare(b[0],a[0]));
        int[] top = new int[k];
        for(int i=0; i < k; i++){
            top[i] = list.get(i)[1];
        }
        
        System.out.println("List: "+ list);
        return top;
    }
}
