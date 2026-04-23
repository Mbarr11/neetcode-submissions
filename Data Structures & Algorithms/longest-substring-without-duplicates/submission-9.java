class Solution {
public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.isEmpty()) return 0;

    int max = 0;
    int l = 0, r = 0;
    Set<Character> set = new HashSet<>();

    while (r < s.length()) {
        char c = s.charAt(r);
        // If duplicate found, shrink window from left
        while (set.contains(c)) {
            set.remove(s.charAt(l));
            l++;
        }
        set.add(c);
        max = Math.max(max, r - l + 1); // +1 since r and l are inclusive window ends
        r++;
    }
    return max;
}
}
