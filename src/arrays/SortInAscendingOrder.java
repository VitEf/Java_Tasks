package arrays;

import java.util.Arrays;

public class SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 5, 1, 1, 1};
        System.out.println(Arrays.toString(sortingArrayAsc(arr)));
    }

    public static int[] sortingArrayAsc(int[] arr) {
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
