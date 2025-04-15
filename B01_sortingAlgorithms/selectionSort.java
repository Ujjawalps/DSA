package DSA.B01_sortingAlgorithms;


import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr1 = {7,-4,0,2,-2,12};
        selectionSort_(arr1);
        int[] arr2 = {91,72,53,34,18,9,2,-2,-16,-19,-29};
        selectionSort_(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void selectionSort_(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    
}
