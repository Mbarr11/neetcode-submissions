class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valMap= new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            valMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int currVal = nums[i];
            int valToFind = target - currVal;

            if(valMap.containsKey(valToFind) && valMap.get(valToFind) != i){
                return new int[]{i, valMap.get(valToFind)};
            }

        }
        return new int[]{};
    }
}
