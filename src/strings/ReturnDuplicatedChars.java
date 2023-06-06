package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnDuplicatedChars {

     /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
     */




    public static String test(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency >1 && !result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }


    public static String test2(String str){
        List<String> list = new ArrayList<>();
        String[] arr = str.split("");
        Arrays.stream(arr).distinct().forEach(a -> {  if( Arrays.stream(arr).filter(b -> b.equals(a)).count()>1){ list.add(a);}} );
        return list.toString();
    }

}
