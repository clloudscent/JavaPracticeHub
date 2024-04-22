package assignment2;

import java.util.Stack;

public class StackPractice01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        stack.push(2);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
