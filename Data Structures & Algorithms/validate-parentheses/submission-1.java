class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            switch(c) {
                case '(' -> stack.push(c);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                case '{' -> stack.push(c);
                case '}' -> {
                    if (stack.isEmpty() || stack.pop () != '{') {
                        return false;
                    } 
                }
                case '[' -> stack.push(c);
                case ']' -> {
                     if (stack.isEmpty() || stack.pop () != '[') {
                        return false;
                     }
                }
        
            }
        }
        return stack.isEmpty();
    }
}
