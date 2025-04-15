package DSA.C01_Strings;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder alphabet = new StringBuilder();
        for (int i = 0; i <26; i++) {
            char ch = (char) ('a'+i);
            alphabet.append(ch);
        }
        System.out.println(alphabet);
    }
}
