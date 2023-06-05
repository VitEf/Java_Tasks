package leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        return set.size();
    }
    public int removeDuplicates1(int[] nums) {
        //Insert all array element in the Set.
        //Set does not allow duplicates and sets like LinkedHashSet maintains the order of insertion so it will remove duplicates and elements will be printed in the same order in which it is inserted

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        //copy unique element back to array
        int i = 0;

        for(int each:set){
            nums[i++] = each;
        }
        return set.size();
    }
       public static void main(String[] args) {
        System.out.println("removeDuplicates(new int[]{1, 1, 2}) = " + removeDuplicates(new int[]{1, 1, 2}));
        System.out.println("removeDuplicates(new int[]{0,1,2,3,4}) = " + removeDuplicates(new int[]{0, 1, 2, 3, 4}));
    }
}
