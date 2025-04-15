package DSA.A01_linearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int[][] accounts = {{5,5},{7,3},{4,3}};
//        System.out.println(maximumWealth(accounts));

//        int temp = 1234;
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        do{
//            arr.add(temp % 10);
//            temp /= 10;
//        } while  (temp > 0);
//        System.out.println(arr);
//
//        int num = 1234567;
//        int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
//        System.out.println(Arrays.toString(digits));
//        for(int d : digits)
//            System.out.print(d);


        int[] input = {9,8,7,6,5,4,3,2,1,0};
        int[] out = plusOne(input);
        System.out.println(Arrays.toString(out));

    }
    static int[] plusOne(int[] digits){
        long res = 0;
        for (int digit : digits) {
            res = res * 10 + digit;
        }
        res = res+1;
        int temp = (int) res;

        return Long.toString(res).chars().map(c -> c-'0').toArray();
    }
    static int maximumWealth(int[][] accounts) {

        int[] arr = new int[accounts.length];
        for(int i=0; i<accounts.length; i++){
            int wealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                wealth = wealth + accounts[i][j];
            }
            arr[i] = wealth;
        }
        return maximum(arr);

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
