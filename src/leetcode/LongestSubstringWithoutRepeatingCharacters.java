package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LongestSubstringWithoutRepeatingCharacters {

    /*
    Given a string s, find the length of the longest
substring
 without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        String longest;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

            }
        }
        return -1;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int spaceCount = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                return spaceCount = 1;
            }
        }
        int counter = 0;
        String temp = "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains(s.charAt(i) + "")) {
                temp += s.charAt(i) + "";

            } else {
                if (longest.length() < temp.length()) {
                    longest = temp;
                    temp = s.charAt(i) + "";
                }

            }
        }
        if (longest.length() < temp.length()) {
            longest = temp;
        }
        if (longest.length() == 0) {
            longest = s;
        }
        System.out.println(longest);
        return counter += longest.length();
    }

    public static void main(String[] args) {
//        System.out.println("lengthOfLongestSubstring1(\"abcabcbb\") = " + lengthOfLongestSubstring1("abcabcbb"));
//        System.out.println("lengthOfLongestSubstring1(\"bbbbb\") = " + lengthOfLongestSubstring1("bbbbb"));
//        System.out.println("lengthOfLongestSubstring1(\"pwwkew\") = " + lengthOfLongestSubstring1("pwwkew"));
//        System.out.println("lengthOfLongestSubstring1(\" \") = " + lengthOfLongestSubstring1(" "));
//        System.out.println("lengthOfLongestSubstring1(\"c\") = " + lengthOfLongestSubstring1("c"));
//        System.out.println("lengthOfLongestSubstring1(\"au\") = " + lengthOfLongestSubstring1("au"));
//        System.out.println("lengthOfLongestSubstring1(\"aab\") = " + lengthOfLongestSubstring1("aab"));
//        System.out.println("lengthOfLongestSubstring2(\"aab\") = " + lengthOfLongestSubstring2("aab"));



    }

    public static int lengthOfLongestSubstring2(String s) {
        int spaceCount = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                return spaceCount = 1;
            }
        }
        int counter = 0;
        String temp = "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains(s.charAt(i) + "")) {
                temp += s.charAt(i) + "";

            } else {
                if (longest.length() < temp.length()) {
                    longest = temp;
                    temp = temp.replaceFirst(temp.charAt(i) + "", "");
                }

            }
        }
        if (longest.length() < temp.length()) {
            longest = temp;
        }
        if (longest.length() == 0) {
            longest = s;
        }
        System.out.println(longest);
        return counter += longest.length();
    }

    public static int lengthOfLongestSubstring3(String s) {
        String[] array = new String[]{String.valueOf(s.split(""))};
        return -1;
    }



}
