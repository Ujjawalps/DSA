package DSA.A02_binarySearch;

import org.jetbrains.annotations.NotNull;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-29, -14, -6, 0, 2, 8, 11, 19, 22, 29, 38, 52, 77, 81, 89, 91, 100,};
        int target = 52;
        System.out.println(answer(arr, target));

    }
    static int answer(int[] arr, int target){
        // finding the range...
        //initialising the box size
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch_(arr, target, start, end);
    }
    static int binarySearch_(int @NotNull [] arr, int target, int start, int end){
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
