package DSA.A02_binarySearch;

import org.jetbrains.annotations.NotNull;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-29, -14, -6, 0, 2, 8, 11, 19, 22, 29, 38, 52, 77};
        int target1 = 38;
        System.out.println(orderAgnosticSearch_(arr1, target1));

        int[] arr2 = {83, 63, 43, 22, 12, 9, 6, 1, -3, -11, -32, -54};
        int target2 = -11;
        System.out.println(orderAgnosticSearch_(arr2, target2));
    }
    static int orderAgnosticSearch_(int @NotNull [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(arr[mid] > target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
