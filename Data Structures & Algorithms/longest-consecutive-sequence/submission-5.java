class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> ts = new TreeSet<>();
        for(int num : nums) {
            ts.add(num);
        }
        List<Integer> list = new ArrayList<>(ts);
        int longestSequence = 1;
        int currSequence = 1;
        for(int i = 1; i < list.size(); i++){
            if(Math.abs(list.get(i) - list.get(i - 1)) == 1){
                currSequence++;
                if(currSequence > longestSequence){
                    longestSequence = currSequence;
                }
            }else{
                currSequence = 1;
            }
        }
        return longestSequence;
    }
}
