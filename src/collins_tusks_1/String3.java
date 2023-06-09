package collins_tusks_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String3 {
    /*
      1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false

    2) String - sum of digits in a string
Write a method that can return the sum of the digits in a string

    3)  Array - Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        System.out.println("passwordValidation(\"Po9#id\") = " + passwordValidation("Po9_id"));
        System.out.println("sumOfDigitsInAString(\"984654\") = " + sumOfDigitsInAString("984654"));
        maximumNumberFromAnIntArray(new ArrayList<>(Arrays.asList(2,1,2,3,4,5,6,76,7)));
        maximumNumberFromAnIntArray1(new int[]{2,1,2,3,4,5,6,76,7});
    }

    static boolean passwordValidation(String string) {
        int isDigit = 0, isUpperCase = 0, isLowerCase = 0, isCharacter = 0, isSpace = 0;

        if (string.length() >= 6) {

            for (int i = 0; i < string.length(); i++) {
                if (Character.isSpaceChar(string.charAt(i))) {
                    isSpace++;
                } else if (Character.isUpperCase(string.charAt(i))) {
                    isUpperCase++;
                } else if (Character.isLowerCase(string.charAt(i))) {
                    isLowerCase++;
                } else if (Character.isDigit(string.charAt(i))) {
                    isDigit++;
                } else {
                    isCharacter++;
                }
            }
            if (isSpace > 0) {
                System.out.println("Password should not contain space");
                return false;
            }
            if (isCharacter > 0 && isDigit > 0 && isUpperCase > 0 && isLowerCase > 0) {
                return true;
            } else {
                System.out.println("Password should at least contain one upper case letter\n" +
                        "Password should at least contain one lowercase letter\n" +
                        "Password should at least contain one special characters\n" +
                        "Password should at least contain a digit");return false;
            }
        } else {
            System.out.println("Password MUST be at least 6 characters");
            return false;
        }
    }

    static int sumOfDigitsInAString(String string) {
        int sum = 0;
        List<String> list = new ArrayList<>(Arrays.asList(string.split("")));
        for (String s : list) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    static void maximumNumberFromAnIntArray(ArrayList<Integer> list) {
        int maxNumber = 0;
        Collections.sort(list);
        maxNumber = list.get(list.size() - 1);
        System.out.println("Maximum Number From An Int Array: " + maxNumber);
    }

    static void maximumNumberFromAnIntArray1(int[] array) {
        int maxNumber = 0;
        Arrays.sort(array);
        maxNumber = array[array.length-1];
        System.out.println("Maximum Number From An Int Array: " + maxNumber);
    }


}
