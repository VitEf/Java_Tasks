package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    /*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Example
Return '12:01:00'.
Return '00:01:00'.
Function Description
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
string s: a time in  hour format
Returns
string: the time in  hour format
Input Format
A single string  that represents a time in -hour clock format (i.e.:  or ).
Constraints
All input times are valid
Sample Input
07:05:45PM
Sample Output
19:05:45
 */

    public static void main(String[] args) {

//        System.out.println("timeConversion(\"07:05:45AM\") = " + timeConversion("07:05:45AM"));
//        System.out.println("timeConversion(\"03:15:45pm\") = " + timeConversion("03:15:45pm"));
//        System.out.println("timeConversion(\"00:00:45am\") = " + timeConversion("00:00:45am"));
//        System.out.println("timeConversion(\"00:07:45pm\") = " + timeConversion("00:07:45pm"));

        String s = "Selenium";
//        StringBuffer sb = new StringBuffer(s);
        StringBuilder bf = new StringBuilder(s);
        System.out.println("bf.reverse() = " + bf.reverse());
//        System.out.println("sb.reverse() = " + sb.reverse());

//        System.out.println("sb.subSequence(2,6) = " + sb.subSequence(2, 6));
        System.out.println("bf.append(\"go\") = " + bf.append("go"));

        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println("list = " + list);


    }

    static String timeConversion(String input) {
        String result = null;
//        if (input.endsWith("AM")) {
//            result = input.substring(0, input.indexOf("A"));
//        } else {
//
//        }

        String[] array = input.split(":");
        int hours = Integer.parseInt(array[0]);
        int minutes = Integer.parseInt(array[1]);
        int sec = Integer.parseInt(array[2].substring(0, 2));
        String period = array[2].substring(2);
        if (hours < 0 || minutes < 0 || sec < 0) {
            return result = "Invalid Input!";
        }
        if (period.equalsIgnoreCase("am")) {
            String time = null;
            if (hours < 10) {
                return result = "0" + hours + ":" + minutes + ":" + sec;
            }
            if (minutes < 10) {
                return result = hours + ":" + "0" + minutes + ":" + sec;
            }
            if (sec < 10) {
                return result = hours + ":" + minutes + ":" + "0" + sec;
            }
            return result = hours + ":" + minutes + ":" + sec;
        } else if (period.equalsIgnoreCase("pm")) {
            return result = (hours + 12) + ":" + minutes + ":" + sec;
        } else {
            return result = "Invalid Input!";
        }

    }
}
