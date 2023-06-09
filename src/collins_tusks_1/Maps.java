package collins_tusks_1;

import java.util.*;

public class Maps {
    /*

            🔥 TASKS 🔥👇🏻
            1️⃣ Map -- Frequency of Characters
            Write a method that prints the frequency of each character from a String

            2️⃣  Map -- Min value
            Write a method that can return the minimum value from ta map (DO NOT use sort method)

            3️⃣  Map -- Unique character from String
            Find Unique Characters of a string and put them in a map with the number of occurrences as 1
            For example:
            “aabccddeffft”
            {b=1,e=1,t=1}
     */

    public static void main(String[] args) {

        //       frequencyOfCharacters("aaabbcghghf");
//        System.out.println("frequencyOfCharactersChar(\"aaabbcghghf\") = " + frequencyOfCharactersChar("aaabbcghpsodkfpso1212121ghf"));
//        unique1("aaabbcghghf");
        //       unique("aaabbcghghf");
//        uniqueChar("aaabbcghghf");
//        System.out.println("frequencyOfCharactersReturnOneLoop(\"aaabbcghghf\") = " + frequencyOfCharactersReturnOneLoop("aaabbcghghf"));
//        System.out.println("HappyNewYear(\"java\") = " + HappyNewYear("java"));

//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 34);
//        map.put(2, 34);
//        map.put(3, -1);
//        map.put(4, 465);
//        map.put(5, 8);
////        minValue(map);
//
//        System.out.println("factorial(5) = " + factorial(5));
//        System.out.println("factorial2(5) = " + factorial2(5));
//        skippedNumbers(new ArrayList<>(Arrays.asList(1, 8, 2, 8, 13)));

        anagram(new String[]{"eat", "tea", "tam", "ate", "mat", "bat"});


    }

    static void anagram(String[] input) {
//        String[] input1 = {"eat", "tea", "tam", "ate", "mat", "bat"};
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String eachWord : input) {
            char[] chars = eachWord.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            System.out.println("sortedWord = " + sortedWord);

            if (anagrams.containsKey(sortedWord)) {
                List<String> updatedList = anagrams.get(sortedWord);
                updatedList.add(eachWord);
                anagrams.put(sortedWord, updatedList);
            } else {
                List<String> newValue = new ArrayList<>();
                newValue.add(eachWord);
                anagrams.put(sortedWord, newValue);
            }
        }
        System.out.println(anagrams);
        System.out.println(anagrams.values());
    }

    static void skippedNumbers(List<Integer> listOfNumbers) {
        int maxNumber = listOfNumbers.get(0);
        for (Integer eachNumber : listOfNumbers) {
            if (eachNumber > maxNumber) {
                maxNumber = eachNumber;
            }
        }
        Collections.sort(listOfNumbers);

        List<Integer> set = new ArrayList<>();
        for (int i = 0; i <= maxNumber; i++) {
              set.add(i);
        }
        for (int i = 0; i < set.size(); i++) {
            for (int k = 0; k < listOfNumbers.size(); k++) {
                if (set.get(i) == listOfNumbers.get(k)) {
                    set.remove(i);
                }
            }
        }
        System.out.println("set = " + set);
    }

    static int factorial(int num) {
        int fac = 1;
        for (int i = num; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }


    static int factorial2(int num) {

        if (num <= 2) {
            return num;
        }
        return num * factorial2(num - 1);
    }

    static void frequencyOfCharacters(String string) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(string.split(""));
        for (int i = 0; i < list.size(); i++) {
            int counter = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            map.put(list.get(i), counter);
        }
        System.out.println(map);
    }

    static Map<Character, Integer> frequencyOfCharactersChar(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            int counter = 1;
            for (int j = 0; j < string.length(); j++) {
                if (i != j && string.charAt(i) == string.charAt(j)) {
                    counter++;
                }
            }
            map.put(string.charAt(i), counter);
        }
        return map;
    }

    static Map<String, Integer> frequencyOfCharactersReturn(String string) {

        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(string.split(""));
        for (int i = 0; i < list.size(); i++) {
            int counter = 1;
            String k = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            map.put(list.get(i), counter);
        }
        return map;
    }

    static Map<String, Integer> frequencyOfCharactersReturnOneLoop(String string) {

        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(string.split(""));
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        return map;
    }

    static void unique(String string) {
        Map<String, Integer> map = frequencyOfCharactersReturn(string);
        Map<String, Integer> mapOfUnique = new HashMap<>();
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() == 1) {
                mapOfUnique.put(each.getKey(), each.getValue());
                //               map.remove(each.getKey());
            }
        }
        //       System.out.println(map);
        System.out.println(mapOfUnique);

    }

    static void uniqueChar(String string) {
        Map<Character, Integer> map = frequencyOfCharactersChar(string);

        System.out.println(map);
    }

    static void unique1(String string) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(string.split(""));
        for (int i = 0; i < list.size(); i++) {
            int counter = 1;
            String k = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            if (counter == 1) {
                map.put(list.get(i), counter);
            }
        }
        System.out.println(map);
    }

    static void minValue(Map<Integer, Integer> map) {
        int max = Integer.MAX_VALUE;
        for (Integer each : map.values()) {
            if (each < max) {
                max = each;
            }
        }
//        System.out.println(max);
    }

    public static String HappyNewYear(String string) {
        String str = "";
        if (string.equalsIgnoreCase("have fun")) {
            return str = "Success in the new year";
        }
        return HappyNewYear("have fun");
    }


}
