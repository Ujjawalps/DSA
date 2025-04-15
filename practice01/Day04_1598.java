package DSA.practice01;

import java.util.Stack;

public class Day04_1598 {
    public static void main(String[] args) {
        String[] logs = {"./","ho3/","tl8/"};
        System.out.println(Answer(logs));
    }
    static int Answer(String[] logs){
        Stack<String> stk = new Stack<>();
        for (String log : logs) {
            if (log.charAt(0) != '.') {
                stk.push(log);
            } else if (log.charAt(1) == '.') {
                if (stk.empty()) {
                    continue;
                }
                stk.pop();
            }

        }
        return stk.size();
    }
}
