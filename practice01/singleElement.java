package DSA.practice01;

public class singleElement {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,4,8,8};
        int[] arr2 = {1,1,2,3,3};
        System.out.println(singleNonDuplicate(arr1));
        System.out.println(singleNonDuplicate(arr2));
    }
    static int singleNonDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            int[] conj = conj(arr, mid);
            if (conj[0] == -1){
                return arr[mid];
            }
            if(conj[0]%2 ==0){
                if(arr[mid]%2==0){
                    start = mid + 2;
                }else {
                    start = mid + 1;
                }
            }else {
                if (arr[mid] % 2 == 0) {
                    end = mid - 2;
                } else {
                    end = mid - 1;
                }
            }
        }
        return arr[start];
    }
    static int[] conj(int[] arr, int mid){
        if(arr[mid] == arr[mid+1]){
            return new int[] {mid, mid+1};
        } else if (arr[mid] == arr[mid-1]) {
            return new int[] {mid-1, mid};
        }
        return new int[] {-1, -1};
    }
}
