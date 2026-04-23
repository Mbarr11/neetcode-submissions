class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longestSequence = 0;
        int currentSequence = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                currentSequence = 1;
                while(set.contains(num + currentSequence)){
                    currentSequence++;
                }
            }
            longestSequence = Math.max(longestSequence, currentSequence);
        }
        return longestSequence;
    }
}
