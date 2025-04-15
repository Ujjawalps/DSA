package DSA.C01_Strings;

public class Performance {
    public static void main(String[] args) {
        String alphabet = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            alphabet += ch;
        }
        System.out.println(alphabet);
        // here we are creating new object at each step
        // like "a" -> "ab" -> "abc" -> "abcd" -> "abcde"....
        // Thus, we'll have too much string having no ref variable
        // Solution -> StringBuilder Class where we can modify the String.
    }
}




