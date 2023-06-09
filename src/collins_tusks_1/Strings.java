package collins_tusks_1;

import java.util.*;
import java.util.stream.Collectors;

public class Strings {
    /*

String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

=============================================================

String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

==============================================================

String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

     */

    public static void main(String[] args) {
        frequencyOfChars("AAEEEABBCDD");
        frequencyOfChars2("AAEEEABBCDD");
//        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc", "cab"));
//        System.out.println("sameLetters(\"abc\", \"abb\") = " + sameLetters("abc", "abb"));
//        removeDuplicates("AAABBBCCC");
//        removeDuplicates2("AAABBBCCC");
//        System.out.println("sameLetters2(\"abc\", \"cab\") = " + sameLetters2("abc", "cab"));
//        System.out.println(sameLetters2("aabc", "cab"));
//        System.out.println("sameLetters(\"aabc\", \"abc\") = " + sameLetters("aabc", "abc"));


    }

    static void frequencyOfChars(String str) {
        String res = "";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (int a = 0; a < list.size(); a++) {
            if (!res.contains(""+ list.get(a)))
            res += Collections.frequency(list, list.get(a)) + list.get(a);
        }
        System.out.println(res);
    }

    static void frequencyOfChars2(String str) {
        String res = "";
        String temp = "";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            do {
                temp += str.charAt(i);
                counter++;
            }while (!temp.contains(""+str.charAt(i)));
            if (!res.contains(""+str.charAt(i))){
                res += counter + str.charAt(i);

            }
        }
        System.out.println(res);
    }



    static boolean sameLetters(String str1, String str2) {
        String res = "";
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
    static void removeDuplicates(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list = list.stream().distinct().collect(Collectors.toList());
        String s = "";
        for (String s1 : list) {
            s+=s1;
        }
        System.out.println(s);
    }

    static void removeDuplicates2(String str) {
        Set<String> list = new LinkedHashSet<>(Arrays.asList(str.split("")));
        String s = "";
        for (String s1 : list) {
            s+=s1;
        }
        System.out.println(s);
    }

    static boolean sameLetters2(String str1, String str2) {

        Set<String> list1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> list2 = new TreeSet<>(Arrays.asList(str2.split("")));
        return list1.equals(list2);
    }
}
