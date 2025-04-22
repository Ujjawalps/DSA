package DSA.A00_Pattern;

public class pattern_14 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j)%2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }
}
