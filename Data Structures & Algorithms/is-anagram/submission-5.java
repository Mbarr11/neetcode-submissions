class Solution {
    public boolean isAnagram(String s, String t) {

        // can sort both strings and check for equality
        // can create a char[] of length 26. each index symbolizes a letter in the alpahbet index 0 is a index 26 is z.
        // iterate through the string and add increment the index the character belongs to. Do this for both string and
        // compare both char arrays for equality
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);

    }
}
