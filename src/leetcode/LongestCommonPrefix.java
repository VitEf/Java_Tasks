package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println("longestCommonPrefix(new String[]{\"flower\",\"flow\",\"flight\"}) = " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("longestCommonPrefix(new String[]{\"dog\",\"racecar\",\"car\"}) = " + longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println("longestCommonPrefix(new String[]{\"flower\",\"flower\",\"flower\",\"flower\"}) = " + longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);

        String pref = strs[0];
        int pos = 0;
        for (int i = 1; i < strs.length; i++) {
            int counter = 0;
            String temp = strs[i];
            if (pref.length() > temp.length()) {
                for (int k = 0; k < temp.length(); k++) {
                    if (temp.charAt(k) == pref.charAt(k)) {
                        counter++;
                    } else {
                        break;
                    }

                }
            }else {
                for (int k = 0; k < pref.length(); k++) {
                    if (temp.charAt(k) == pref.charAt(k)) {
                        counter++;
                    } else {
                        break;
                    }

                }
            }
            pos = counter;
        }
        return pref.substring(0, pos);
    }
}
