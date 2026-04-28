class Solution {

    public static int search(int[] nums, int target) {

        int rotationPointIndex = rotationPointIndex(nums);
        int solution;

        if (rotationPointIndex == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        } else if (target >= nums[0]) {
            return binarySearch(nums, 0, rotationPointIndex - 1, target);
        } else {
            return binarySearch(nums, rotationPointIndex, nums.length - 1, target);
        }
    }


    private static int rotationPointIndex(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int middle;
        int firstValue = nums[0];

        while ((l < r) && (r != l + 1)) {

            middle = l + (r - l) / 2;

            if (firstValue < nums[middle]) {
                l = middle;
            } else {
                r = middle;
            }
        }
        return firstValue < nums[r] ? 0 : r;
    }

    private static int binarySearch(int[] nums, int l, int r, int target) {
        int middle;
        while (l <= r) {
            middle = l + (r - l) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                r = middle - 1;
            } else {
                l = middle + 1;
            }
        }
        return -1;

    }
}
