class Solution {
       public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!values.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
