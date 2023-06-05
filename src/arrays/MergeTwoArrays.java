package arrays;

import java.util.Arrays;

public class MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static void main(String[] args) {
        int[] arr1 = {1,2,5,9,87,9,5,7,8,9};
        int[] arr2 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }
}
