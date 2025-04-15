package DSA.practice01;

public class Day3_1701 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,5},{4,3}};
        System.out.println(answer(arr));
    }
    static float answer(int[][] arr){
        int X = arr[0][0];
        float wT = 0;
        for (int[] ints : arr) {
            if (ints[0] > X) {
                X = ints[0] + ints[1];
            } else {
                X = X + ints[1];
            }
            wT = wT + (X - ints[0]);

        }
        return wT/ arr.length;
    }
}
