class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max = Math.max(r-l + 1, max);
            r++;
        }
        return max;
    }
}
