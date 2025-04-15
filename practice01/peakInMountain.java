package DSA.practice01;

public class peakInMountain {
    public static void main(String[] args) {
        int[] arr1 = {0,2,1,0};
        System.out.println(answer(arr1));

    }
    static int answer(int[] arr){
        int s = 0;
        int e = arr.length -1;

        while(s!=e){
            int mid = s + (e-s)/2;
            if(arr[mid] < arr[mid+1]){
                // we are in decreasing part
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}
