package collins_tusks_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays3 {
    public static void main(String[] args) {

        concat(new int[]{1,2,3},new int[]{4,5,6});
//        removeString(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed")));
        removeString2(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed")));
//        removeNum(new ArrayList<>(Arrays.asList(5,4,8,5,66,1541,54,100,215,5,8,99,511)));
        removeNum2(new ArrayList<>(Arrays.asList(5,4,8,5,66,1541,54,100,215,5,8,99,511)));
        removeNum2(new ArrayList<>(Arrays.asList(5,4,8,5,66,1541,54,100,215,5,8,99,511)));

    }
    /*
        1 Array - Concat two arrays
        Write a return method that can concate two arrays

        2ArrayList - Remove "Ahmed"
        Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed

        3ArrayList - Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void concat(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            array[counter++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[counter++] = array2[i];
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

    public static void removeString(ArrayList<String> list) {
        list.removeIf(p -> p.equals("Ahmed"));
        System.out.println("list = " + list);
    }

    public static void removeNum(ArrayList<Integer> list) {
        list.removeIf(p -> p>100);
        System.out.println("list = " + list);
    }

    public static void removeString2(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Ahmed")) {
                list.remove(list.get(i));
//                i--;
            }
        }
        System.out.println("list2 = " + list);
    }

    public static void removeNum2(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>100) {
                list.remove(list.get(i));
//                i--;
            }
        }
        System.out.println("list2 = " + list);
    }

    public static void removeNum3(ArrayList<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<100) {
                newList.add(i);
            }
        }
        System.out.println("newList = " + newList);
    }


}
