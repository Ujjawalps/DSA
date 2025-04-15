package DSA.practice01;

public class threeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Answer(arr));
    }
    static boolean Answer(int[] arr){
        int i = 0;
        while (i<arr.length-2){
            if(arr[i]%2 != 0){
                if(arr[i+1]%2 != 0){
                    if(arr[i+2]%2 != 0){
                        return true;
                    }else {
                        i++;
                    }
                }else {
                    i++;
                }
            }else {
                i++;
            }
        }
        return false;
    }

}
