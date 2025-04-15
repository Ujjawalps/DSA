package DSA.practice01;

import java.util.Stack;

public class baseballGame682 {
    public static void main(String[] args) {
        String[] arr = {"5","2","C","D","+"};
        String[] arr1 = {"5","+","-2","4","C","D","9","+","+"};
        String[] arr2 = {"D","2","D","5","+"};
        String[] arr3 = {"1","C"};
        String[] arr4 = {"-60","D","-36","38","13","C","C","-33","53","79"};
        System.out.println(Answer(arr4));
    }
    static int Answer(String[] arr){
        Stack<String> stk = new Stack<>();
        int count = 0;
        for (String string : arr) {
            if (string.charAt(0) == 'C') {
                if(stk.empty()){
                    continue;
                }
                stk.pop();
                count--;
            } else if (string.charAt(0) == '+') {
                if(stk.size()<2){
                    continue;
                }
                String value_1 = stk.get(count - 1);
                String value_2 = stk.get(count - 2);
                int temp = Integer.parseInt(value_1) + Integer.parseInt(value_2);
                stk.push(Integer.toString(temp));
                count++;
            } else if (string.charAt(0) == 'D') {
                if(stk.empty()){
                    continue;
                }
                String value = stk.get(count - 1);
                int temp = Integer.parseInt(value) * 2;
                stk.push(Integer.toString(temp));
                count++;
            }else {
                stk.push(string);
                count++;
            }
        }
        int sum = 0;
        for (String s : stk) {
            sum = sum + Integer.parseInt(s);
        }
        return sum;

    }
}
