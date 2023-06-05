package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord_58 {

    public static int lengthOfLastWord(String s) {
        List<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
        return list.get(list.size()-1).length();
    }

    public static void main(String[] args) {
        System.out.println("lengthOfLastWord(\"Hello World\") = " + lengthOfLastWord("Hello World"));
    }
}
