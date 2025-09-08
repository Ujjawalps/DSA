package DSA.practice01;
import DSA.B01_sortingAlgorithms.insertionSort;
public class largestNumber {
    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        largestNum(arr);
    }

    private static String largestNum(int[] arr) {
        insertionSort_(arr);

        return null;

    }
    static void insertionSort_(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }else {
                    break;
                }

            }

        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
