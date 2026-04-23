class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            hs.put(numbers[i], i + 1);
        }
        for(int num : hs.keySet()){
            int valueToFind = target - num;
            if(hs.containsKey(valueToFind) && hs.get(num) != hs.get(valueToFind)){
                return new int[] { Math.min(hs.get(num),hs.get(valueToFind)), Math.max(hs.get(num),hs.get(valueToFind))};
            }
        }
        return new int[] {-1,-1};
    }
}
