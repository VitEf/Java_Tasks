package collins_tusks_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {

    /*
    1️⃣ Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function
can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -
1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are
many more correct answers).

2️⃣ Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters

3️⃣ Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {
//        moveZerosToTheEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0});
//        permutationCombinations(new String[]{"1", "0", "2"});
        nUniqueIntegers(7);
        nUniqueIntegers2(5);
        nUniqueIntegers3(5);
//        printArray(new char[]{'1', '0', '2'});
//        System.out.println("sum0(new int[]{1, 0, 2, 0, 3, 0, 4, 0}) = " + sum0(new int[]{1, 0, 2, 0, 3, 0, 4, 0}));

//        System.out.println("array(new int[]{1, 0, 2, 0, 3, 0, 4, 0}) = " + Arrays.toString(array(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));


    }


    public static void moveZerosToTheEnd(int[] arr) {

        Arrays.sort(arr);
        int[] array = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                array[counter++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //===========================================================================//
    public static void nUniqueIntegers(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * number);
        }
        while (!isUnique(arr) && !sum0(arr)) {
            changeToUnique(arr);
            array(arr);
        }
//        System.out.println("nUniqueIntegers = " + Arrays.toString(array(arr)));
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("nUniqueIntegers = " + Arrays.toString(arr) + " | sum = " + result);
    }

    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] changeToUnique(int[] arr) {
//        if (isUnique(arr)) {
//            return arr;
//        } else {
        while (!isUnique(arr)) {
            int a = (int) (Math.random() * arr.length);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j] && i != j) {
                        arr[i] = -a;
                    }
                }
            }
        }
        return arr;
    }


    public static int[] array(int[] arr) {
        if (sum0(arr)) {
            return arr;
        } else {
            int num = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                num += arr[j];
            }
            arr[arr.length - 1] = -num;
            return arr;
        }

    }

    public static boolean sum0(int[] arr) {
        int sum = -1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum == 0) {
            return true;
        }
        return false;
    }

    //===========================================================================//

    public static void permutationCombinations(String[] array) {
        int size = factorial(array.length);
        List<List<String>> list = new ArrayList<>(size);
        list.add(Arrays.asList(array));

        for (int i = 0; i < size; i++) {
            List<String> temp = new ArrayList<>(Arrays.asList(array));


            while (list.contains(temp)) {
                for (int k = 0; k < temp.size(); k++) {
                    for (int j = 0; j < temp.size(); j++) {
                        if (!temp.get(k).equals(temp.get(j))) {
//
//
                            String str = temp.get(k);

                            temp.set(k, temp.get(j));
                            temp.set(j, str);
                        }
                    }
                }
            }
            list.add(temp);
        }
        System.out.println(list);
    }


    public static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

//===========================================================================//

    public static void printArray(char[] array) {

        char[] tmp = new char[2];

        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    tmp[count++] = array[j];
                }
            }
            System.out.println("" + array[i] + tmp[0] + tmp[1]);
            System.out.println("" + array[i] + tmp[1] + tmp[0]);

        }
    }

//===========================================================================//

    public static void nUniqueIntegers2(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * number);
        }
        while (!isUnique(arr)) {
            int sum = 0;
            int a = (int) (Math.random() * arr.length);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j] && i != j) {
                        arr[i] = -a;
                    }
                }
            }
            for (int i = 0; i < arr.length - 1; i++) {
                sum += arr[i];
            }
            arr[(arr.length - 1)] = -sum;
        }
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//        }
        System.out.println("nUniqueIntegers2 = " + Arrays.toString(arr) + " | sum = 0: " + sum0(arr));
    }

    public static void nUniqueIntegers3(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = (int) (Math.random() * number);
            arr[arr.length - 1 - i] = -arr[i];
        }
        if (isUnique(arr)) {
            System.out.println("nUniqueIntegers3 = " + Arrays.toString(arr) + " | sum = 0: " + !sum0(arr));
        }else {
            nUniqueIntegers3(number);
        }
    }
}
