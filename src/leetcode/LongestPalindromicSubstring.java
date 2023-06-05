package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        String pal = "";
        Set<String> list = new HashSet<>();


        for (int i = 0; i < s.length(); i++) {
           list.add(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); j++) {
                list.add(s.substring(i, j+1));
            }
        }
//        System.out.println(list);

        for (String each : list) {
            String reverse = "";
             for (int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse) && each.length() > pal.length()) {
                pal = each;
            }
        }

        return pal;
    }

    public static void main(String[] args) {
        System.out.println("longestPalindrome(\"ababs\") = " + longestPalindrome("ababs"));
        System.out.println("longestPalindrome(\"a\") = " + longestPalindrome("a"));
        System.out.println("longestPalindrome(\"bb\") = " + longestPalindrome("bb"));
        System.out.println("longestPalindrome(\"ab\") = " + longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

    }
}
