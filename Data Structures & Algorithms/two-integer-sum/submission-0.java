class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] pairs = new int[2];
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];

            for(int j=i+1; j < nums.length;j++){
                int y = nums[j];

                if(x+y == target){
                    System.out.println("Found at: "+ i + " , " + j);
                    pairs[0] = i;
                    pairs[1] = j;
                }
            }
        }

        return pairs;
    }
}
