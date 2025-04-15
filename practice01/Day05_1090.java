package DSA.practice01;

import java.util.Stack;

public class Day05_1090 {
    public static void main(String[] args) {
        String str = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(str));

    }
    static String reverseParentheses(String str){
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                StringBuilder temp = new StringBuilder();
                while (!stk.isEmpty() && stk.peek() != '(') {
                    temp.append(stk.pop());
                }
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                }
                for (int j = 0; j < temp.length(); j++) {
                    stk.push(temp.charAt(j));
                }
            } else {
                stk.push(str.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.insert(0, stk.pop());
        }
        return result.toString();


    }

}
