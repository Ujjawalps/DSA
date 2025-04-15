package DSA.A01_linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 32, 44, 543, -32, 55, 12, -343, 38, -54};
        int target = 55;
        int start = 2;
        int end = 6;
        int ans = linearSearchRange(arr, target, start, end);
        System.out.println("55 is present at: "+ ans);

    }
    static int linearSearchRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
