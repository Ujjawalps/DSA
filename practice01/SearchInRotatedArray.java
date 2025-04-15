package DSA.practice01;

import org.jetbrains.annotations.NotNull;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        // we have 4 cases...
        if(pivot == -1){
            // arr is not rotated
            return binarySearchInRange_(arr, target,0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearchInRange_(arr, target, 0, pivot-1);
        }
        return binarySearchInRange_(arr, target, pivot+1, arr.length-1);
    }


    static int binarySearchInRange_(int[] arr, int target, int start, int end){
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
