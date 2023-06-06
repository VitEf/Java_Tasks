package strings;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {

     /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {
        String str = "abc";
        String str1 = "bca";
        System.out.println(anagram(str, str1));
        System.out.println(anagram1(str, str1));
        System.out.println(anagram1(str, "iore"));
    }


    public static boolean anagram(String str, String str1) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";
        for (char each : ch1) {
            a1 += each;
        }
        for (char each : ch2) {
            a2 += each;
        }
        return a1.equals(a2);
    }



    public static boolean anagram1(String str, String str1) {
        str = new TreeSet<String>(Arrays.asList(str.split(""))).toString();
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        return str.equals(str1);
    }
}
