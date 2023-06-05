package arrays;

public class FindMinimum {
    /*
    Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{5, 8, 9, 7, 4, 5, 6, 4}));
    }

    public static int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }
}
