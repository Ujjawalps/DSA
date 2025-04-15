package DSA.practice01;

import java.util.ArrayList;
import java.util.List;

public class duplicateNo {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2}; // {1,3,4,2,2}
        System.out.println(findDisappearedNumbers(arr));
    }
    static int findDisappearedNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i+1){
                if(arr[arr[i]-1] == arr[i]){
                    return arr[i];
                }else {
                    swap(arr, i, arr[i]-1);
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
