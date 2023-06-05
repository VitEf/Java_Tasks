package leetcode;

public class FindTheIndexOfTheFirstOccurrenceString {

    public static int strStr(String haystack, String needle) {
        int y = needle.length();
        int x = haystack.length();
        for (int i = 0; i < haystack.length(); i++) {
            try {
                if (haystack.substring(i, i + y).equals(needle)) {

                    return i;
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("strStr(\"sadbutsad\",\"sad\") = " + strStr("sadbutsad", "sad"));
    }
}


