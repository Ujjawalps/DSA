package DSA.LoveBabbarDSAsheet;

import java.util.ArrayList;

public class raough {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(firstAndLast(arr, 5));
        System.out.println(last(arr, 5));
    }
    static ArrayList<Integer> firstAndLast(int[] arr, int x){
        ArrayList<Integer> result = new ArrayList<>();
        int first = first(arr, x);
        int last = last(arr, x);
        result.add(first);
        result.add(last);
        if(last == -1){
            result.set(1, first);
        }
        return result;

    }
    static int first(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>x){
                end = mid - 1;
            } else if (arr[mid]<x) {
                start = mid + 1;
            }else{
                result = mid;
                end = mid-1;
            }
        }
        return result;
    }
    static int last(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>x){
                end = mid - 1;
            } else if (arr[mid]<x) {
                start = mid + 1;
            }else{
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }
}
