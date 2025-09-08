package DSA.R01_Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {7,9,11,22,31,33,41,50};
        int key = 41;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binarySearch_(arr, start, end, key));
    }

    private static boolean binarySearch_(int[] arr, int start,int end, int key) {
        if (start > end) {
            return false; // base case
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == key) return true;
        if(arr[mid] > key){
            return binarySearch_(arr, start, mid-1, key);
        }else {
            return binarySearch_(arr, mid+1, end, key);
        }
    }


}
