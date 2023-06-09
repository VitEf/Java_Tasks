package collins_tusks_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings2 {
    /*
    String -- Find the unique
Write a return method that can find the unique characters
from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA


String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

    public static void main(String[] args) {
//        System.out.println("findTheUnique(\"AAABBBCCCDEF\") = " + findTheUnique("AAABBBCCCDEF"));
//        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
//        sortLettersAndNumbers("DC501GCCCA098911");
//        sortLettersAndNumbers3("ERGFEDRG123EERGERG12");
        sortLettersAndNumbers2("DC501GCCCA078911");
        sortLettersAndNumbers2("drgfdgdf456456dfgdfg7787dfg545dfgdf4545dfg5454dfg");
        sortLettersAndNumbers3("drgfdgdf456456dfgdfg7787dfg545dfgdf4545dfg5454dfg");
        sortLettersAndNumbers3("DC501GCCCA078911");
        sortLettersAndNumbers2("asd456asd789asd123asd98798");
        sortLettersAndNumbers3("asd456asd789asd123asd98798");
        sortLettersAndNumbers2("asdasdas1dasd123asd");
        sortLettersAndNumbers3("asdasdas1dasd123asd");
        sortLettersAndNumbers2("456dfg7897dfg1321dfg");
        sortLettersAndNumbers3("456dfg7897dfg1321dfg");


    }

    static String findTheUnique(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    counter++;
                }
            }
            if (counter == 1) {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    static String reverse(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    static void sortLettersAndNumbers(String str) {
//        str = "drgfdgdf456456dfgdfg777";
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String str8 = "";
        String str9 = "";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))) {
                s1 = "" + str.charAt(i);
            }
        }
        str2 = str.substring(0, str.indexOf(s1) + 1);//DC501
        str3 = str.substring(str.indexOf(s1) + 1);//GCCCA098911
        List<String> list = new ArrayList<>(Arrays.asList(str2.split("")));
        List<String> list1 = new ArrayList<>(Arrays.asList(str3.split("")));
        list = list.stream().sorted().collect(Collectors.toList());
        list1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);
        for (String s : list) {
            str4 += s;
        }
        for (String s : list1) {
            str5 += s;
        }
        for (int i = 0; i < str4.length() - 1; i++) {
            if (Character.isDigit(str4.charAt(i)) && Character.isLetter(str4.charAt(i + 1))) {
                s2 = "" + str4.charAt(i);
            }
        }
        for (int i = 0; i < str5.length() - 1; i++) {
            if (Character.isDigit(str5.charAt(i)) && Character.isLetter(str5.charAt(i + 1))) {
                s3 = "" + str5.charAt(i);
            }
        }
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        str6 = str4.substring(str4.lastIndexOf(s2) + 1) + str4.substring(0, str4.indexOf(s2) + 1);
        str7 = str5.substring(str5.lastIndexOf(s3) + 1) + str5.substring(0, str5.indexOf(s3) + 2);
        str1 = str6 + str7;
        System.out.println(str1);
    }

    static void sortLettersAndNumbers2(String input) {


        boolean isLetter = Character.isLetter(input.charAt(0));
        String output = "";
        boolean nowIsLetter;

        String sub = input.substring(0, 1);

        for (int i = 1; i < input.length(); i++) {
            char chr = input.charAt(i);
            nowIsLetter = Character.isLetter(chr);

            if ((nowIsLetter && isLetter) || (!nowIsLetter && !isLetter)) {
                sub = sub.concat("" + chr);
            } else {
                output = output.concat(sortString(sub));
                sub = "" + chr;
                isLetter = !isLetter;
            }
        }
        output = output.concat(sortString(sub));

        System.out.println(output);
    }

    static String sortString(String inputString) {

        char arr[] = inputString.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    static void sortLettersAndNumbers3(String str) {
        String result = "";
        String s1 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))||Character.isDigit(str.charAt(i+1)) && Character.isDigit(str.charAt(i))) {
                s1 += str.charAt(i);
                if (i==str.length()-2) {
                    result += sortString(s1+str.charAt(i+1));
                }
            }
            if (Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))||Character.isDigit(str.charAt(i+1)) && Character.isLetter(str.charAt(i))) {
                s1 = sortString(s1+str.charAt(i));
                result += s1;
                s1 = "";
            }
        }
        System.out.println(result);
    }
}
