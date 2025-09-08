package DSA.D01_bitManipulation;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,1,4,1};
        System.out.println(findUnique_(arr));
    }

    private static int findUnique_(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n; //unique = unique^n;
        }
        return unique;
    }
}
