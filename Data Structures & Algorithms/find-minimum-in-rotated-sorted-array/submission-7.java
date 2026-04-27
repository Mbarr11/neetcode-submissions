class Solution {

    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int middle;
        int firstValue = nums[0];

        while((l < r) && (r != l + 1)){

            middle = l + (r - l) / 2;

            if(firstValue < nums[middle]){
                l = middle;
            }else{
                r = middle;
            }
        }
        return Math.min(firstValue, nums[r]);
    }
}
