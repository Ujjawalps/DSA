package DSA.B01_sortingAlgorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr1 = {7,-4,0,2,-2,12};
        insertionSort_(arr1);
        int[] arr2 = {91,72,53,34,18,9,2,-2,-16,-19,-29};
        insertionSort_(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void insertionSort_(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }else {
                    break;
                }

            }

        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
