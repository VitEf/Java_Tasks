package strings;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("isPalindrome(\"Otto otto\") = " + isPalindrome("Otto otto"));
        System.out.println("isPal(\"otto\") = " + isPal("otto"));
        System.out.println("isPal(\"Palindrome\") = " + isPal("Palindrome"));
        System.out.println("isPal1(\"otto\") = " + isPal1("otto"));

        System.out.println("isPalSpace(\"otto otto\") = " + isPalSpace("ot to otto"));
        System.out.println(isPalindrome1("Otto oTTo"));
    }

    static boolean isPalindrome1(String str) {
        String s = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char firstChar = s.charAt(start);
            char lastChar = s.charAt(end);
            String s1 = String.valueOf(firstChar);
            if (!Character.isLetter(firstChar) || Character.isSpaceChar(firstChar)) {
                start++;
                continue;
            }
            if (!Character.isLetter(lastChar) || Character.isSpaceChar(lastChar)) {
                end--;
                continue;
            }
            if (firstChar != lastChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    static boolean isPalindrome(String string) {
        String reverse = "";
        for (int i = string.length()-1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
//        System.out.println("reverse = " + reverse);
        if (string.equalsIgnoreCase(reverse)) {
            return true;
        }
        return false;
    }

    static boolean isPal(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equalsIgnoreCase(str);
    }

    static boolean isPal1(String str) {
        String rev = "";
        int num = str.length()-1;
        while (num >= 0) {
            rev += str.charAt(num);
            num--;
        }
        System.out.println("rev = " + rev);
        return str.equalsIgnoreCase(rev) ? true : false;
    }

    static boolean isPalSpace(String str) {
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            }
        }
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
//        System.out.println("reverse = " + reverse);
        if (word.equalsIgnoreCase(reverse)) {
            return true;
        }
        return false;
    }

}
