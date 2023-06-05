package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddNumberToList {
    static List<Integer> list(ArrayList<Integer> arr, int x) {
        Collections.sort(arr);
        if (x < arr.get(0)) {
            arr.add(0,x);
        }
        if (x > arr.get(arr.size()-1)) {
            arr.add(arr.size(), x);
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (x > arr.get(i) && x < arr.get(i + 1)) {
                arr.add(i + 1, x);
            }
        }
        return arr;
    }

    static String reverse(String s) {
        String reverse = "";
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (int i = list.size()-1; i >= 0; i--) {
            reverse += list.get(i)+" ";
        }
        return reverse;
    }
    static List<Integer> list2(ArrayList<Integer> arr, int x) {
        Collections.sort(arr);
//        if (x < arr.get(0)) {
//            arr.add(0,x);
//        }
        if (x > arr.get(arr.size()-1)) {
            arr.add(arr.size(), x);
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (x < arr.get(i)) {
                arr.add(i,x);break;
            }
            if (x > arr.get(i) && x < arr.get(i + 1)) {
                arr.add(i + 1, x);
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 0) = " + list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 0));
        System.out.println("list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 10) = " + list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 10));
        System.out.println("list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 2) = " + list(new ArrayList<>(Arrays.asList(1, 6, 5, 3)), 2));

        System.out.println("reverse(\"the sky is blue\") = " + reverse("the sky is blue"));
    }

}
