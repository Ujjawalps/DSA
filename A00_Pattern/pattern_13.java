package DSA.A00_Pattern;

public class pattern_13 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
