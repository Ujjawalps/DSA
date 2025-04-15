package DSA.practice01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray_349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};  //{4, 5, 9}
        int[] nums2 = {9,4,9,8,4}; //{4,4,8,9,9}
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to the hash set
        for (int num : nums1) {
            set.add(num);
        }

        // Check elements of nums2 against the hash set
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert the result set to an array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;

    }
}
