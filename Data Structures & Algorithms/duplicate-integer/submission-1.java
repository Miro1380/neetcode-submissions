class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer item: nums){
            if(set.contains(item)){
                return true;
            }
            set.add(item);
        }
        return false;
    }
}