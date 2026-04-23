class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> hashS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hashT = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){

            char currCharS = s.charAt(i);
            if(!hashS.containsKey(currCharS)){
                hashS.put(currCharS,1);
            }else{
                hashS.put(currCharS,hashS.get(currCharS)+ 1);
            }

            char currCharT = t.charAt(i);
            if(!hashT.containsKey(currCharT)){
                hashT.put(currCharT,1);
            }else{
                hashT.put(currCharT,hashT.get(currCharT)+ 1);
            }
        }

        
        return hashS.equals(hashT);
    }
}
