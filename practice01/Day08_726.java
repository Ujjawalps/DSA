package DSA.practice01;

import java.util.Stack;

public class Day08_726 {
    public static void main(String[] args) {

    }
    static String countOfAtoms(String str){
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ')'){
                stk.push(str.charAt(i));
            }else {
                int mult = str.charAt(i+1);
                
            }

        }
        return "hi";
    }
}
