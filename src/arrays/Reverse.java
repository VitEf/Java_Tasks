package arrays;

import java.util.Arrays;

public class Reverse {
     /*
    write a function that can reverse an array
     */

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 5, 1, 1, 1};
        System.out.println("reverse(arr) = " + Arrays.toString(reverse(arr)));
        System.out.println("reverse1(arr) = " + Arrays.toString(reverse1(arr)));
    }


    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static int[] reverse1(int[] arr) {
        int[] result = new int[arr.length];
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[counter++] = arr[i];
        }
        return result;
    }

}
