class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if(currChar == '{' || currChar == '[' || currChar == '('){
                stack.add(currChar);
            }else{
                if(stack.isEmpty()){ return false;}
                char lastCharFromStack = stack.pop();
                if(currChar == '}' && lastCharFromStack != '{'){ return false; }
                if(currChar == ']' && lastCharFromStack != '['){ return false; }
                if(currChar == ')' && lastCharFromStack != '('){ return false; }
            }
        }
        return stack.isEmpty();
    }

}
