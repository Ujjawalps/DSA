package DSA.B01_sortingAlgorithms;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,7,8,2,3,1};
        cyclicSort_(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void cyclicSort_(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i+1){
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
