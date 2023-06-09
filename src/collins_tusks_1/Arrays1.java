package collins_tusks_1;


import java.util.Arrays;

/*
TASKS 🔥👇🏻
  1) Array - Find Minimum
Write a method that can find the maximum number from an int Array

    2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    3) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

 */
public class Arrays1 {

    public static void main(String[] args) {

        sortArrayAscending(new int[]{10, 9, 8, 7, 44, 234, 9, 45,-3,-56, 614, 321});
min(new int[]{10, 9, 8, 7, 44, 234, 9, 45,-3,-56, 614, 321});
        sortArrayDescending(new int[]{10, 9, 8, 7, 44, 234, 9, 45, 614, 321});
        findMinimumInArray(new int[]{10, 9, 8, 7, 44, 234, 9, 45, 614, 321});

    }

    public static void sortArrayAscending(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            int min = Integer.MAX_VALUE;
            int counter = 0;
            for (int i = k; i < arr.length; i++) {
                if (arr[i] <= min && arr[i] != arr[counter]) {
                    min = arr[i];
                    counter=i;
                    arr[counter] = arr[i];
                }
            }
            arr[counter] = arr[k];
            arr[k] = min;
            min = Integer.MAX_VALUE;
        }
        System.out.println("Array - Sort Ascending: " + Arrays.toString(arr));
    }

    public static void sortArrayDescending(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            int max = Integer.MIN_VALUE;
            int counter = 0;
            for (int i = k; i < arr.length; i++) {
                if (arr[i] >= max && arr[i] != arr[counter]) {
                    max = arr[i];
                    counter=i;
                    arr[counter] = arr[i];
                }
            }
            arr[counter] = arr[k];
            arr[k] = max;
            max = Integer.MIN_VALUE;
        }
        System.out.println("Array - Sort Descending: " + Arrays.toString(arr));
    }
    public static void findMinimumInArray(int[] arr) {
        sortArrayAscending(arr);
        System.out.println("Minimum number of array : " + arr[0]);
        System.out.println("Maximum number of array : " + arr[arr.length-1]);
    }

    public static void min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number of array : " + min);
    }
}