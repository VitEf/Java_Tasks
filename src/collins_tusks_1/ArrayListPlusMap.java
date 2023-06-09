package collins_tusks_1;

import java.util.*;

public class ArrayListPlusMap {

    /*
    TASKS 🔥👇🏻
1️⃣  ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
  2️⃣  ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
  3️⃣   Map - Sort the map by values
Write a method that can sort the Map by values
     */

    public static void main(String[] args) {
        System.out.println("sortingInAscending(new ArrayList<>(Arrays.asList(1,5,54,8,0,2,3,0,2,1,5,7))) = " + sortingInAscending(new ArrayList<>(Arrays.asList(1, 5, 54, 8, 0, 2, 3, 0, 2, 1, 5, 7))));
        System.out.println("sortingInAscendingStr(new ArrayList<>(Arrays.asList('*','1','d','D','0','1','I','z','%'))) = " + sortingInAscendingStr(new ArrayList<>(Arrays.asList('*', '1', 'd', 'D', '0', '1', 'I', 'z', '%'))));
        System.out.println("sortingInDescending(new ArrayList<>(Arrays.asList(1,5,54,8,0,2,3,0,2,1,5,7))) = " + sortingInDescending(new ArrayList<>(Arrays.asList(1, 5, 54, 8, 0, 2, 3, 0, 2, 1, 5, 7))));
//        System.out.println("sortingTheMapByValues(new HashMap<>(Map.of(1, 34, 2, 34, 3, 345, 4, 465,5,8))) = " + sortingTheMapByValues(Map.of(1, 34, 2, 34, 3, 345, 4, 465, 5, 8),"asc"));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 34);
        map.put(2, 34);
        map.put(3, 345);
        map.put(4, 465);
        map.put(5, 8);
        System.out.println("sortingTheMapByValues(map) = " + sortingTheMapByValues(map, "desc"));


    }

    static List<Integer> sortingInDescending(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) < list.get(j) && i != j) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
//1,5,54,8,0,2,3,0,2,1,5,7
    static List<Integer> sortingInAscending(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j) && i != j) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    static List<Character> sortingInAscendingStr(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) < list.get(j) && i != j) {
                    char temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    static Map<Integer, Integer> sortingTheMapByValues(Map<Integer, Integer> map, String string) {
        if (string.equalsIgnoreCase("Asc")) {
            for (int i = 1; i <= map.size(); i++) {
                for (int j = i; j <= map.size(); j++) {
                    if (map.get(i) > map.get(j) && i != j) {
                        int temp = map.get(i);
                        map.replace(i, map.get(j));
                        map.replace(j, temp);
                    }
                }
            }
        } else if (string.equalsIgnoreCase("Desc")){
            for (int i = 1; i <= map.size(); i++) {
                for (int j = i; j <= map.size(); j++) {
                    if (map.get(i) < map.get(j) && i != j) {
                        int temp = map.get(i);
                        map.replace(i, map.get(j));
                        map.replace(j, temp);
                    }
                }
            }
        }
        return map;
    }
}
