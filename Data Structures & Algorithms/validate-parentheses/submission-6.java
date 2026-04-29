class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray(); 
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ;i<c.length; i++){
            System.out.println(c[i]);
            if(c[i] == '[' || c[i] == '{' || c[i] == '('){
                stack.push(c[i]);
            }
            else if(!stack.empty() && c[i] == ']' && stack.peek() == '['){
                stack.pop();
            }
            else if(!stack.empty() && c[i] == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(!stack.empty() && c[i] == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.empty();
    }
}
