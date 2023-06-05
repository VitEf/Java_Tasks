package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */
    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "Apple", "Cherry"};

        frequencyChar(arr);
    }

    static void frequencyChar(String[] arr) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : arr) {
            int frequency = 0;
            for (String s : arr) {
                if (each.equals(s)) {
                    frequency++;
                }
            }
            map.put(each, frequency);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
