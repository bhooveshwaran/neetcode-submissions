class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> paranthesesMap = new HashMap<>();
        paranthesesMap.put(']','[');
        paranthesesMap.put('}','{');
        paranthesesMap.put(')','(');
        for(int i=0;i<s.length();i++){
            if(paranthesesMap.keySet().contains(s.charAt(i))){
                if(!stack.isEmpty()){
                    if(stack.peek().equals(paranthesesMap.get(s.charAt(i))))
                        stack.pop();
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
