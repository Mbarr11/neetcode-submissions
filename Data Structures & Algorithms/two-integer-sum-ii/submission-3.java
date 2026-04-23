class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int rIndex = numbers.length - 1;
        int lIndex = 0;
        while(lIndex < rIndex){
            if(numbers[lIndex] + numbers[rIndex] == target){
                return new int[] {lIndex + 1, rIndex + 1};
            }else if(numbers[lIndex] + numbers[rIndex] > target){
                rIndex--;
            }else{
                lIndex++;
            }
        }
        return new int[] {-1,-1};
    }
}
