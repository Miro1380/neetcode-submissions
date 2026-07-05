class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap map = new HashMap();

        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]+1));
                return true;
            }
            else
                {
                    map.put(nums[i],1);
                }
        }
        //System.out.println(map.values().toString());
        return false;
    }
}
