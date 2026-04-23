class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toLowerCase().toCharArray();
        int rIndex = s.length() - 1;
        for(int lIndex = 0; lIndex < s.length() - 1 && rIndex >= lIndex; lIndex++){
            if(charArr[lIndex] == ' ' || !Character.isLetter(charArr[lIndex])){
                if(!Character.isDigit(charArr[lIndex])){
                    continue;
                }
            }
            if(charArr[rIndex] == ' '|| !Character.isLetter(charArr[rIndex])){
                if(!Character.isDigit(charArr[rIndex])){
                    rIndex--;
                    lIndex--;
                    continue;
                }
            }
            if(charArr[lIndex] != charArr[rIndex]){
                return false;
            }
            rIndex--;
        }
        return true;
    }
}
