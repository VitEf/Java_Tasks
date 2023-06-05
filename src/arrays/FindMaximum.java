package arrays;

public class FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, 8, 9, 7, 4, 5, 6, 4}));
    }


    public static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
