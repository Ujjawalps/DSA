package DSA.practice01;

import org.jetbrains.annotations.NotNull;

public class ceilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 8, 10, 16, 19, 24, 32, 33, 39, 47};
        int target = 22;
        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));

    }

    //return the index of the smallest element that is greater than or eq to target...
    static int ceiling(int @NotNull [] arr, int target){
        // what if target is the greatest element in the array...
        if(target > arr[arr.length-1]) {
            return -1;
        }

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
        return start;
    }

    //return the index of the largest element that is smaller than or eq to target...
    static int floor(int @NotNull [] arr, int target){
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
        return end;
    }
}
