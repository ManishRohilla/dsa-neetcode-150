class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens){
                if (checkOperator(token)){
                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        int result = evaluateExpr(num2, num1, token);
                        stack.push(result);
                } else {
                        stack.push(Integer.parseInt(token));
                }
        }
        return stack.pop();
    }
    private boolean checkOperator(String token){
        return token.equals("+") || 
        token.equals("-") || token.equals("*") || token.equals("/");
    }
    private int evaluateExpr(int num1, int num2 , String tokenOp)
    {
        switch(tokenOp){
                case "+": return num1+num2;
                case "-": return num1-num2;
                case "*": return num1*num2;
                case "/": return num1/num2;
                default: throw new IllegalArgumentException("Invalid operator: "+tokenOp);               
        }
    }
}
