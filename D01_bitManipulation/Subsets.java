package DSA.D01_bitManipulation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // double n = Math.pow(2, arr.length);
        int n = 1 << nums.length;  // same as 2^nums.length

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) { // check if j-th bit is set
                    row.add(nums[j]);
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
