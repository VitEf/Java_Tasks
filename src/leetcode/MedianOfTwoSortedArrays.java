package leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int counter = 0;
        double result = 0;
        for (int i = 0; i < nums1.length; i++) {
            merged[counter++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[counter++] = nums2[i];
        }
       merged = Arrays.stream(merged).sorted().toArray();
        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged));
        if (counter % 2 == 0) {
            System.out.println("merged[counter / 2-1] = " + merged[counter / 2 - 1]);
            System.out.println("merged[counter / 2] = " + merged[counter / 2]);
            result = (merged[counter / 2-1] + merged[counter / 2]);
            result = result/2;
        } else {
            result = merged[counter/2];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) = " + findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}) = " + findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }
}
