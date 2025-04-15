package DSA.A01_linearSearch;

public class code {
    public static void main(String[] args) {
        int[] arr = {25, 13, 65, 17, -9, -1, 24, -29, -32, 44};
        int target = -29;
        int ans = linearSearch(arr, target);
        if(ans !=-1){
            System.out.println("index of "+target+" is "+ans);
        }
        else {
            System.out.println("index not found for "+ target);
        }


        int target2 = -1;
        int ans2 = linearSearch2(arr, target2);
        if(ans2 != Integer.MAX_VALUE){
            System.out.println("we found the element "+ans2);
        }
        else {
            System.out.println("element doesn't exist...");
        }



    }
    static int linearSearch(int[] arr, int target){
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
