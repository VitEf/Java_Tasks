package leetcode;


import java.util.Stack;

public class ValidParentheses_20 {

    public static void main(String[] args) {
//        System.out.println("isValid(\"()\") = " + isValid("()"));
//        System.out.println("isValid(\"()[]{}\") = " + isValid("()[]{}"));
//        System.out.println("isValid(\"(]\") = " + isValid("(]"));
//        System.out.println("isValid1(\"()\") = " + isValid1("()"));
//        System.out.println("isValid1(\"()[]{}\") = " + isValid1("()[]{}"));
//        System.out.println("isValid1(\"({{{{}}}))\") = " + isValid1("({{{{}}}))"));
        System.out.println("isValidArr(\"({{{{}}}))\") = " + isValidArr("({{{{}}}))"));
        System.out.println("isValidArr(\"()\") = " + isValidArr("()"));
    }

    public static boolean isValid(String s) {
        int x = 0;

        for (int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
                x++;
            }
            if(s.charAt(i)=='{'&&s.charAt(i+1)=='}'){
                x++;
            }
            if(s.charAt(i)=='['&&s.charAt(i+1)==']'){
                x++;
            }
        }
        System.out.println(x);
        return s.length()==2*x;
    }

    public static boolean isValid1(String s) {
        int x = 0;
        for (int i = 0; i < s.length(); i++){
            for(int k = i+1; k < s.length(); k++){
                if(s.charAt(i)=='('&&s.charAt(k)==')'&&k!=i+2){
                    x++;break;
                }
                if(s.charAt(i)=='{'&&s.charAt(k)=='}'&&k!=i+2){
                    x++;break;
                }
                if(s.charAt(i)=='['&&s.charAt(k)==']'&&k!=i+2){
                    x++;break;
                }
            }
        }
        System.out.println("x = " + x);
        return s.length()==2*x;
    }

    public static boolean isValidArr(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()) {
                return false;
            }
                    if (s.charAt(i) == ')' && stack.peek() == '(') {
                        stack.pop();
                    }
                    else if (s.charAt(i) == '}' && stack.peek() == '{') {
                        stack.pop();
                    }
                    else if (s.charAt(i) == ']' && stack.peek() == '[') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }System.out.println(stack);
        return stack.isEmpty();
        }

    }

