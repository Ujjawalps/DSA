package DSA.A01_linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 14},
                {25, 43, 21, 72},
                {27, 35, 11},
                {33, 8}
        };
        int target = 35;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        int max = max(arr);
        System.out.println(max);

        int min = min(arr);
        System.out.println(min);
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[] {-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int max(int[][] arr){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
