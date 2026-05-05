class Solution {
    public int characterReplacement(String s, int k) {
        int maxWindow = 0;
        int maxFrequency = 0;
        int[] charFrequency = new int[26];
        int left = 0;
        
        for(int right = 0; right < s.length(); right++){
            charFrequency[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency, charFrequency[s.charAt(right) - 'A']);
            
            int windowLength = right - left + 1;
            while(windowLength - maxFrequency > k){
                charFrequency[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
            }
            maxWindow = Math.max(maxWindow, windowLength);
        }
        return maxWindow;
    }
}
