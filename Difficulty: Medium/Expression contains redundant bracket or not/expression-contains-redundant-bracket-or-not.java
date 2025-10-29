class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean bool = false;
            if(ch==')'){
                if(stack.peek()=='(') return true;
                while(stack.peek() !='('){
                    char top=stack.pop();
                if (top == '+' || top == '-' || top == '*' || top == '/') {
                bool = true;
                }
                }
                
                stack.pop();
                if(bool !=true){
                    return true;
                }
                
            }else{
                stack.push(ch);
            }
        }
        return false;
    }
}
