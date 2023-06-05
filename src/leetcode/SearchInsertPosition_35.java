package leetcode;

public class SearchInsertPosition_35 {

    public static int searchInsert(int[] nums, int target) {
        int x = 0;
        try {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target || nums[i] > target)
                    return i;

                if (i == nums.length-1)
                    return nums.length;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("searchInsert(new int[]{1,3,5,6}, 5) = " + searchInsert(new int[]{1, 3, 5, 6}, 5));
//        System.out.println("searchInsert(new int[]{1,3,5,6}, 2) = " + searchInsert(new int[]{1, 3, 5, 6}, 2));
//        System.out.println("searchInsert(new int[]{1,3,5,6}, 7) = " + searchInsert(new int[]{1, 3, 5, 6}, 7));;
    }
}
