package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 5, 1, 1, 1};
        System.out.println(secondLargestNumber(arr));
        System.out.println(secondLargestNumber1(arr));
        System.out.println(secondLargestNumber2(arr));
    }

    public static int secondLargestNumber1(int[] arr) {
        int secMax = arr[0];
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                secMax = arr[i - 1];break;
            }
        }
        return secMax;
    }

    public static int secondLargestNumber(int[] arr){
        return Arrays.stream(arr).filter(p -> p != Arrays.stream(arr).max().getAsInt()).max().getAsInt();
    }

    public static int secondLargestNumber2(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;

    }
}
