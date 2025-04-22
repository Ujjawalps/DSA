package DSA.A00_Pattern;

public class pattern_11 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==0){
                System.out.println();
            }
            if(i!=0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
        for (int j = 0; j < 2*n-1; j++) {
            System.out.print("*");
        }
    }
}
