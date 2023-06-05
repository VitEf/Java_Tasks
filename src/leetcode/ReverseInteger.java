package leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("reverse(357) = " + reverse(357));
        System.out.println("reverse(-357) = " + reverse(-357));
        System.out.println("reverse(1534236469) = " + reverse(1524236469));
        System.out.println("reverseSB(357) = " + reverseSB(357));
        System.out.println("reverseSB(-357) = " + reverseSB(-357));
        System.out.println("reverseSB(1534236469) = " + reverseSB(1534236469));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("reverseLCOfficial(1534236469) = " + reverseLCOfficial(1534236469));
    }

    public static int reverse(int x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) {
            return 0;
        }
        String number = String.valueOf(x);

        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {

            if (Character.isDigit(number.charAt(i))) {
                reverse += number.charAt(i);

            }
        }
        if (x < 0) {
            reverse = "-" + reverse.substring(0, number.length() - 1);
        }
        long reverseN = Long.parseLong(reverse);
        return (int) reverseN;
    }

    public static int reverseSB(int x) {

        String z = new StringBuffer("" + x).reverse().toString();//reverse x and convert to string
        try {
            return (x < 0) ? -Integer.valueOf(z.substring(0, z.length() - 1)) : Integer.valueOf(z);// if x=-321 z="123-" where only 123 is required so substring is used
        } catch (NumberFormatException e) {
            return 0;  // if  integer overflow occurs return 0
        }
    }

    public static int reverseLCOfficial(int x) {
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }
}
