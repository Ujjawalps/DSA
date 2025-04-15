package DSA.practice01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Day06_1717 {
    public static void main(String[] args) {
        String s = "aabbaaxybbaabb";
        int x = 5, y = 4;
//        System.out.println(maximumGain(s, x, y));
//        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(maxPoints(s, x, y));
    }
    static int maxPoints(String s, int x, int y) {
        if (x >= y) {
            return Alternative(s, 'a', 'b', x, y);
        } else {
            return Alternative(s, 'b', 'a',y, x);
        }
    }
    static int Alternative(String s, char first, char second, int x, int y){
        Stack<Character> stack = new Stack<>();
        int totalPoints = 0;
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && ch == second) {
                stack.pop();
                totalPoints += x;
            } else {
                stack.push(ch);
            }
        }
        StringBuilder remainingString = new StringBuilder();
        for (char ch : stack) {
            remainingString.append(ch);
        }
        Stack<Character> stack2 = new Stack<>();
        for (char ch : remainingString.toString().toCharArray()) {
            if (!stack2.isEmpty() && stack2.peek() == second && ch == first) {
                stack2.pop();
                totalPoints += y;
            } else {
                stack2.push(ch);
            }
        }
        return totalPoints;
    }









    static int maximumGain(String str, int x, int y){
        int sum = 0;
        int index = 0;
        while(str.contains("ab") || str.contains("ba")){
            if(y>x){
                if(str.contains("ba")){
                    index = str.indexOf("ba");
                    str = str.substring(0, index)
                            + str.substring(index + 2);
//                    str = str.replace("ba", "");
                    sum += y;
                }else {
                    index = str.indexOf("ab");
                    str = str.substring(0, index)
                            + str.substring(index + 2);
//                    str = str.replace("ab", "");
                    sum += x;
                }
            }else {
                if(str.contains("ab")){
                    index = str.indexOf("ab");
                    str = str.substring(0, index)
                            + str.substring(index + 2);
//                    str = str.replace("ab", "");
                    sum += x;
                }else {
                    index = str.indexOf("ba");
                    str = str.substring(0, index)
                            + str.substring(index + 2);
//                    str = str.replace("ba", "");
                    sum += y;
                }
            }
        }
        return sum;
    }
}
