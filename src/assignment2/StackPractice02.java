package assignment2;

import java.io.FilterOutputStream;
import java.util.Stack;

public class StackPractice02 {
    public static void main(String[] args) {
        String a = "(";
        String b = ")";
        String c = "{";
        String d = "}";

        String bracket = "{()}";
        String test1 = "()";
        String test2 = "{()}";

        Stack<Character> stack = new Stack<>();
        // a && b a||b
        String result = "true";
        for (int i = 0; i < test2.length(); i++) {
            if (test2.charAt(i) == '(' || test2.charAt(i) == '{') {
                stack.push(test2.charAt(i));
            }
//            if (test2.charAt(i) == ')' && stack.pop() != '(') {
            if (stack.pop() != '(' && test2.charAt(i) == ')') {
                result = "false";
//            } else if (test2.charAt(i) == '}' && stack.pop() != '{') {
            } else if (stack.pop() != '{'&&test2.charAt(i) == '}' ) {
                result = "false";
            }
        }
        if(!stack.isEmpty()){
            result = "false";
        }
        System.out.println(result);
    }
}
