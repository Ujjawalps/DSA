package DSA.A00_Pattern;

public class pattern_06 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                char res = (char)(j+65);
                System.out.print(res);
            }
            System.out.println();
        }
    }
}
