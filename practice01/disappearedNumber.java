package DSA.practice01;

import java.util.ArrayList;
import java.util.List;

public class disappearedNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2}; // {1,2,3,4,5,6,7,8}
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i+1){
                if(arr[arr[i]-1] == arr[i]){
                    i++;
                }else {
                    swap(arr, i, arr[i]-1);
                }
            }else{
                i++;
            }
        }
//        int[] temp = {};
        List<Integer> temp = new ArrayList<>();
        for(int ind=0; ind<arr.length; ind++){
            if(arr[ind] != ind+1){
                temp.add(arr[ind]);
            }
        }
        return temp;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
