package arrays;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,5,6,0,8,9};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }

    public static int[] moveZerosToTheEnd(int[] array) {
        int[] result = new int[array.length];
        int count = 0;
        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }
        return result;
    }
}
