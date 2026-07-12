class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        Stack<Character> stack = new Stack();

        for(int i=0; i< s.length(); i++){
            char current = s.charAt(i);
            if(current == '[' || current == '{' || current == '('){
                stack.add(current);
            }
            //Current is a closing sign
            else{
                if(stack.empty() || stack.peek() != map.get(current)){
                    return false;
                }
                //Stack is empty or stack.peek() is not the right closing sign?
                stack.pop();
            }
        }
        return stack.empty();
    }
}
