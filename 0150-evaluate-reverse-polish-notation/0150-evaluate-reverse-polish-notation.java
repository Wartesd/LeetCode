class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack = new ArrayDeque<>();
        for(int i=0; i< tokens.length;i++){
            if (isNumeric(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                switch (tokens[i]){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.peek();
    }
    
    public boolean isNumeric(String str){
        return str != null && !str.matches("[-+*/]");
    }
}