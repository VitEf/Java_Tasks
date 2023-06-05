package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int[] twoSumArr(int[] nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println("twoSum(new int[]{2,7,11,15},9) = " + Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("twoSum(new int[]{3,2,4}, 6) = " + Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println("twoSum(new int[]{3,3}, 6) = " + Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println("!!!twoSum(new int[]{2, 7, 11, 15, 7, 2, 7}, 9) = " + Arrays.toString(twoSum(new int[]{2, 7, 11, 15, 7, 2, 7}, 9)));
        System.out.println("twoSumArr(new int[]{2, 7, 11, 15}, 9) = " + Arrays.toString(twoSumArr(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("twoSumArr(new int[]{3, 2, 4}, 6) = " + Arrays.toString(twoSumArr(new int[]{3, 2, 4}, 6)));
        System.out.println("twoSumArr(new int[]{2, 7, 11, 15, 7, 2, 7}, 9) = " + Arrays.toString(twoSumArr(new int[]{2, 7, 11, 15, 7, 2, 7}, 9)));
    }
}
