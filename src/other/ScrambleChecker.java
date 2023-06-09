package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScrambleChecker {

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();

        // Step 2
        for (char c : str1.toCharArray()) {
            str1Map.put(c, str1Map.getOrDefault(c, 0) + 1);
        }

        // Step 3
        for (char c : str2.toCharArray()) {
            str2Map.put(c, str2Map.getOrDefault(c, 0) + 1);
        }

        // Step 4
        for (char c : str2Map.keySet()) {
            if (!str1Map.containsKey(c) || str1Map.get(c) < str2Map.get(c)) {
                return false;
            }
        }

        // Step 5
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter str2: ");
        String str2 = scanner.nextLine();

        scanner.close();

        System.out.println(scramble(str1, str2));
    }
}
