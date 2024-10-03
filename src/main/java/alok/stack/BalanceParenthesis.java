package alok.stack;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String str = "(}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }else{
                if(str.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(str.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(str.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }
            }
        }

        if (stack.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
