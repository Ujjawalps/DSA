package DSA.A01_linearSearch;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 543, -32, -343, 38, -54};
        int target = -32;

        int ans = linearSearch(arr, target);
        System.out.println(ans);

        int ans2 = linearSearch2(arr, target);
        System.out.println(ans2);

        boolean ans3 = linearSearch3(arr, target);
        System.out.println(ans3);

    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }


    // returning the element if it is found in the arr
    static int linearSearch2(int[] arr, int target){
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // returning the true if it is found in the arr else false
    static boolean linearSearch3(int[] arr, int target){
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}
