package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int x = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                list.add(nums[i]);
                nums[i]=0;
                x++;
            }
        }
        System.out.println("list = " + list);
        int y = 0;
        for(int each:list){
            nums[y++]=each;
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return x;
    }

    public static int removeElement1(int[] nums, int val) {

        int i = 0;

        for (final int num : nums)
            if (num != val)
                nums[i++] = num;
        System.out.println("nums = " + Arrays.toString(nums));
        return i;

    }

    public static void main(String[] args) {
        System.out.println("removeElement(new int[]{0,1,2,2,3,0,4,2},2) = " + removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println("removeElement1(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2) = " + removeElement1(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
