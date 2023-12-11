package org.example;

import java.util.Stack;

public class Child {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
           if (c=='('||c=='{'||c=='[') stack.push(c);
           else {
               if (stack.isEmpty()) return false;
              char top=stack.peek();
              if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))stack.pop();

              else return false;
           }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String  a="()[]{}";

        System.out.println(isValid(a));

    }
}