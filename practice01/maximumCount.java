package DSA.practice01;

public class maximumCount {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,-1,-1,0,0,1,2,3,3};
        int[] arr1 = {5,20,66,1314};
        System.out.println(answer(arr1));
    }

    static int answer(int[] arr){
        if(arr[0] > 0 || arr[arr.length-1] < 0){
            return arr.length;
        }
        // checking for first +ve no...
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= 0){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        int count_pos = arr.length - start;

        // checking for last -ve no...
        int st = 0;
        int ed = arr.length-1;
        while(st <= ed){
            int mid = st + (ed-st)/2;
            if(arr[mid] < 0){
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        int count_neg = ed + 1;
        return Math.max(count_pos, count_neg);
    }
}
