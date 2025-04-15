package DSA.practice01;

public class max_Min {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static long max(int[] arr) {
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //{3, 2, 1, 56, 10000, 167}
    static long min(int[] arr) {
        long min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
