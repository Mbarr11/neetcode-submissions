class Solution {
    public static String minWindow(String s, String t) {
        if (t.length() == 0) { return ""; }

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
            windowMap.put(t.charAt(i), 0);
        }

        String outputString = "";
        int minSubstringLength = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        // int charactersNeeded = t.length();
        int charactersNeeded = tMap.size();
        int charactersHave = 0;

        while (r < s.length()) {
            if (windowMap.containsKey(s.charAt(r))) {
                windowMap.put(s.charAt(r), windowMap.get(s.charAt(r)) + 1);
                if (windowMap.get(s.charAt(r)).equals(tMap.get(s.charAt(r)))) {
                    charactersHave++;
                }
            }
            r++;
            // shrink window while substring is valid
            while (charactersHave == charactersNeeded) {
                int currentSubstringLength = r - l;
                if (currentSubstringLength < minSubstringLength) {
                    minSubstringLength = currentSubstringLength;
                    outputString = s.substring(l, r);
                }
                if (windowMap.containsKey(s.charAt(l))) {
                    windowMap.put(s.charAt(l), windowMap.get(s.charAt(l)) - 1);
                    if (windowMap.get(s.charAt(l)) < tMap.get(s.charAt(l))) {
                        charactersHave--;
                    }
                }
                l++;
            }
        }
        return outputString;
    }

}
