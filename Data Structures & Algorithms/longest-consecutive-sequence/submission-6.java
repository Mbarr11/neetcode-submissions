class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums) {
            hashSet.add(num);
        }

        int longestSequence = 0;

        for(int num : hashSet){
            if(!hashSet.contains(num - 1)){
                int currSequence = 1;
                while(hashSet.contains(num + currSequence)){
                    currSequence++;
                }
                longestSequence = Math.max(longestSequence, currSequence);
            }
        }
        return longestSequence;
    }
}
