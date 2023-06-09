package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeMap {
    /**
     Implement a solution for:
     example_input:
     [
     {"USA":
     {"CALIFORNIA":
     {"Los Angeles":
     {"1212 41st Ave":"Home"}
     }
     }
     },

     {"1a":{"1b":{"1c":{"1d":{"1e":"1f"}}}}},

     {"z":"x"},

     {"t":"y"},

     {"z":"z"}
     ]

     example_output:
     [
     {"USA.CALIFORNIA.Los Angeles.1212 41st Ave":"Home"},

     {"1a.1b.1c.1d.1e":"1f"},

     {"z":"x"},

     {"t":"y"},

     {"z":"z"}
     ]

     You don’t need to parse any input; data will be instantiated for you.
     This is just an example, please think about other possibilities
     in the input and discuss any assumptions.
     No need to worry about empty keys or values

     Bonus points for using only language built-in data structures and a
     good starting point is to finalize the method signature.




     }
     */
    public static void main(String[] args) {


        Map<String, Object> map = new HashMap<>();
        map.put("id", 5);
        map.put("name", "Josef");
        map.put("city", "WAS");
        Map<String, Object> map1 = new HashMap<>();
        map.put("id", 6);
        map.put("name", "Hazard");
        map.put("city", "CA");


        System.out.println(flat(map));
        System.out.println("flat1(map) = " + flat1(map));
    }


    public static Map<String, String> flat(Map<String, Object> input){
        Map<String, String> toReturn = new HashMap<>();
        for (Map.Entry<String, Object> entry: input.entrySet()) {
            if(entry.getValue() instanceof Map){
                Map<String, Object> innerMap = (Map<String, Object>)entry.getValue();
                for(Map.Entry<String, Object> innerEntry: innerMap.entrySet()) {
                    if(innerEntry.getValue() instanceof Map){

                    }
                    else {
                        toReturn.put(entry.getKey() + "." + innerEntry.getKey(), innerEntry.getValue().toString());
                    }
                }
            } else {
                toReturn.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return toReturn;
    }

    public static Map<String, String> flat1(Map<String, Object> input){
        Map<String, String> toReturn = new HashMap<>();
        rec(toReturn, input, new ArrayList<>());
        return toReturn;
    }

    public static void rec(Map<String, String> toReturn, Map<String, Object> input, List<String> keys) {
        for (Map.Entry<String, Object> entry: input.entrySet()) {
            if(entry.getValue() instanceof Map){
                keys.add(entry.getKey());
                rec(toReturn, (Map<String, Object>) entry.getValue(), keys);
            } else {
                final StringBuffer key = new StringBuffer();
                if(keys.size() > 0) {
                    keys.forEach(x -> key.append(x).append("."));
                }
                key.append(entry.getKey());
                toReturn.put(key.toString(), entry.getValue().toString());
            }
        }
        if(keys.size() > 0) {
            keys.remove(keys.size() - 1);
        }
    }
}
