package DSA.practice01;

import java.util.Arrays;

public class missingNo {
    public static void main(String[] args) {
        int[] arr = {8,6,4,2,3,5,7,0,1};
        int[] arr1 = {9,6,4,2,3,5,7,0,1};
        int[] arr2 = {1, 2};
//        int ans = missingNumber(arr);
//        int ans2 = missingNumber(arr2);
//        System.out.println(ans);
//        System.out.println(ans2);
//        System.out.println(answer2(arr));
        System.out.println(answer2(arr1));
//        System.out.println(answer2(arr2));

    }
    static int missingNumber(int[] arr){
        Arrays.sort(arr);
        int[] temp = new int[arr.length+1];
        for (int i = 0; i <= arr.length; i++) {
            temp[i] = i;
        }
        int s1=0;
        int s2=0;
        int e1=arr.length-1;
        int e2=temp.length-1;
        // [0, 1, 2, 4, 5, 6, 7]  Vs [0, 1, 2, 3, 4, 5, 6, 7]
        // [0, 1, 2, 3, 4, 5, 7]  Vs [0, 1, 2, 3, 4, 5, 6, 7]
        // [0, 1, 2, 3, 5, 6, 7]  Vs [0, 1, 2, 3, 4, 5, 6, 7]
        while(s1<=e1){

            if (arr.length == 2){
                // [0, 2] Vs [0, 1, 2]
                if(arr[s1] == temp[s2]){
                    s1 = s1+1;
                    s2 = s2+1;
                }else {
                    return temp[s2];
                }
            }else {
                int mid1 = s1 + (e1-s1)/2;
                int mid2 = s2 + (e2-s2)/2;
                if(arr[mid1] != temp[mid2]){
                    e1 = mid1-1;
                    e2 = mid2-1;
                } else{
                    s1 = mid1+1;
                    s2 = mid2+1;
                }
            }
        }
        return temp[s2];

    }

    static int answer(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        while(true){
            if(arr[i] == i){
                i++;
            }else {
                break;
            }
        }
        return i;
    }
    static int answer2(int[] arr){
        Arrays.sort(arr);
        if(arr.length ==1){
            if(arr[0]==0){
                return 1;
            }
            return 0;
        } else if (arr.length == 2) {
            // [1, 2]
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]!=i){
                    return i;
                }
            }
        }else {
            //[9,6,4,2,3,5,7,0,1].... [0, 1, 2, 3, 4, 5, 6, 7, 9]
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=i){
                    return i;
                }
            }
        }
        //[8,6,4,2,3,5,7,0,1].... [0, 1, 2, 3, 4, 5, 6, 7, 8]
        return arr.length;
    }
}
