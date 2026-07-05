class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if(map.containsKey(complement)){
                arr1[1] = i;
                arr1[0] = map.get(complement);
            }

            map.put(nums[i], i );



           

        }
        System.out.println(map.entrySet());
        return arr1;
    }
}
