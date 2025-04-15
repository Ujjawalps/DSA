package DSA.B01_sortingAlgorithms;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,-4,0,2,-2,12};
        bubbleSort_(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort_(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
