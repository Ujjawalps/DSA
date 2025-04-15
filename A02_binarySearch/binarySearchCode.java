package DSA.A02_binarySearch;

import org.jetbrains.annotations.NotNull;

public class binarySearchCode {
    public static void main(String[] args) {
        int[] arr = {-29, -14, -6, 0, 2, 8, 11, 19, 22, 29, 38, 52, 77};
        int target = 38;
        int[] arr1 = {};

        int ans = binarySearch_(arr, target);
        System.out.println(ans);
        System.out.println(binarySearch_(arr1, target));

        System.out.println(binarySearchInRange_(arr, target, 5,12));

    }

    static int binarySearch_(int @NotNull [] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchInRange_(int @NotNull [] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
