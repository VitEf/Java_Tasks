package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
        System.out.println("isPalindrome(123) = " + isPalindrome(123));
    }


    public static boolean isPalindrome(int x) {
        String string = "" + x;
        String reverse = new StringBuilder("" + x).reverse().toString();
        return string.equals(reverse);

    }
}
