class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Integer max = 0;
        for (int num : nums) {
            set.add(num);
        }
        System.out.println("Set: " + set);

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int current = nums[i];

            // If current - 1 is not in set, start chain.
            if (!set.contains(current - 1)) {
                int currentStreak= 1;
                while (set.contains(current+1)) {
                   currentStreak++;
                   current++;
                }
                if(currentStreak > max){
                    max = currentStreak;
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
