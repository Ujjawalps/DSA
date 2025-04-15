package DSA.A01_linearSearch;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 43, -32, -34, 38, -5};
        int min = minimum(arr);
        System.out.println(min);

        int max = maximum(arr);
        System.out.println(max);
    }
    static int minimum(int[] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    static int maximum(int[] arr){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
