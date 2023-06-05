package leetcode;

public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int i = digits[digits.length-1] + 1;
        digits[digits.length-1] = i;
        return digits;
    }
}
